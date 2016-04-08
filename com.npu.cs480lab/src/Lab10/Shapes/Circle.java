
package Lab10.Shapes;


public class Circle extends Shape{
    protected double radius;
   private final static double PI = 3.14;
    
    public Circle() {}
    
    public Circle(String color, double radius) {
        super();
        this.color = color;
        this.radius= radius; 
    }
    public double calculateArea() {
        return PI*radius*radius;
    }
    public double calculatePerimeter() {
        return 2*PI*radius;
    }
}
