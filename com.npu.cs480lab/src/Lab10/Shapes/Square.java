package Lab10.Shapes;


public class Square extends Rectangle{
    protected double side;
   
    
    public Square(String color, double side) {
        super("red", 5.0,6.0);
        this.color = color;
        this.side = side;
    } 
    
    public double calculateArea() {
        return side*side;
    }
    public double calculatePerimeter() {
        return 4*side;
    }
}
