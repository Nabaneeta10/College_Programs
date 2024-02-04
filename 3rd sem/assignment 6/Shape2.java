import java.util.*;
abstract class Shape {
   
    double dimOne;
    double dimTwo;


    public Shape(double dimOne, double dimTwo) {
        this.dimOne = dimOne;
        this.dimTwo = dimTwo;
    }

    abstract double computeArea();
}

class Rectangle extends Shape {

    public Rectangle(double length, double width) {
        super(length, width);
    }

    double computeArea() {
        return dimOne * dimTwo;
    }
}

class Triangle extends Shape {
   
    public Triangle(double base, double height) {
        super(base, height);
    }
    double computeArea() {
        return 0.5 * dimOne * dimTwo;
    }
}

class ShapeDriver {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 8);
        Shape triangle = new Triangle(4, 6);
        System.out.println("Area of Rectangle: " + rectangle.computeArea());
        System.out.println("Area of Triangle: " + triangle.computeArea());
    }
}
