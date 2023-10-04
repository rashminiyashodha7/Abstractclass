package Shape;

abstract class Shapes {
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}
class Circle extends Shapes{
    private double Radius;


    public Circle(double Radius) {
        this.Radius = Radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Radius * Radius;
    }
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * Radius;
    }
}
class Rectangle extends Shapes{
    private double Length;
    private double width;

    public Rectangle(double length, double width) {
        this.Length = length;
        this.width = width;
    }
    @Override
    public double calculateArea() {
        return Length * width;
    }
    @Override
    public double calculatePerimeter() {
        return 2 * (Length + width);
    }
}
class Main{
    public static void main(String[] args) {
        Circle circle = new Circle(7.0);
        Rectangle rectangle = new Rectangle(4.0, 3.0);
        System.out.println("Circle:");
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());


        System.out.println("\nRectangle:");
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }
}
