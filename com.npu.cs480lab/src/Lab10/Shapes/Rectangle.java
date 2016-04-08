
package Lab10.Shapes;


public class Rectangle extends Shape{
    protected double width;
    protected double height;
    
    //public Rectangle() {}
    
    public Rectangle(String color, double width, double height) {
        super();
        this.color = color;
        this.width = width;
        this.height = height;  
    }
    
    public double calculateArea() {
        return width*height;
    }
    public double calculatePerimeter() {
        return 2*(width + height);
    }
}
