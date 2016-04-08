package mid.class_program;

/**
 * Write a test program that uses the max method to find the larger of two
 * circles and the larger of two rectangles.
 */
public class TestProgram {

	public static void main(String[] args) {

		System.out.println("\n******** WORKING WITH CIRCLES ********");

		Circle c1 = new Circle(4.0);
		Circle c2 = new Circle(7.0);

		System.out.println("\nCircle 1");
		c1.printCircle();

		System.out.println("\nCircle 2");
		c2.printCircle();

		Circle largerCircle = (Circle) Circle.max(c1, c2);
		System.out.println("\nLarger Circle");
		largerCircle.printCircle();

		Rectangle r1 = new Rectangle(10, 20);
		Rectangle r2 = new Rectangle(5, 40);

		System.out.println("\n******** WORKING WITH RECTANGLES ********");

		System.out.println("\nRectangle 1");
		r1.printRectangle();

		System.out.println("\nRectangle 2");
		r2.printRectangle();

		Rectangle largerRectangle = (Rectangle) Rectangle.max(r1, r2);
		System.out.println("\nLarger Rectangle");
		largerRectangle.printRectangle();

	}

}
