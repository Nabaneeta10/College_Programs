// Define the abstract class Shape
abstract class Shape3 {
    // Data members
    double dimOne;
    double dimTwo;

    // Constructor
    public void Shape(double dimOne, double dimTwo) {
        this.dimOne = dimOne;
        this.dimTwo = dimTwo;
    }

    // Abstract method to compute area
    abstract double computeArea();
}

// Concrete subclass Rectangle
class Rectangle extends Shape {
    // Constructor
    public Rectangle(double length, double width) {
        super(length, width);
    }

    // Override computeArea method for Rectangle
    @Override
    double computeArea() {
        return dimOne * dimTwo;
    }
}

// Concrete subclass Triangle
class Triangle extends Shape {
    // Constructor
    public Triangle(double base, double height) {
        super(base, height);
    }

    // Override computeArea method for Triangle
    @Override
    double computeArea() {
        return 0.5 * dimOne * dimTwo;
    }
}

// Driver class
public class ShapeDriver {
    public static void main(String[] args) {
        // Create objects of Rectangle and Triangle
        Shape rectangle = new Rectangle(5, 8);
        Shape triangle = new Triangle(4, 6);

        // Invoke computeArea method through abstract class reference variable
        System.out.println("Area of Rectangle: " + rectangle.computeArea());
        System.out.println("Area of Triangle: " + triangle.computeArea());
    }
}