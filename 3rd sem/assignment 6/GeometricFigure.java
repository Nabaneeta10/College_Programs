import java.util.*;
abstract class GeometricFigure {
    double dim1;
    double dim2;
    public GeometricFigure(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    abstract double getArea();
}

class Rectangle extends GeometricFigure {
    public Rectangle(double length, double width) {
        super(length, width);
    }

    double getArea() {
        return dim1 * dim2;
    }
}

class Triangle extends GeometricFigure {

    public Triangle(double base, double height) {
        super(base, height);
    }

    double getArea() {
        return 0.5 * dim1 * dim2;
    }
}


class GeometricFigureDriver {
    public static void main(String[] args) {
        GeometricFigure rectangle = new Rectangle(5, 8);
        GeometricFigure triangle = new Triangle(4, 6);
        System.out.println("Area of Rectangle: " + rectangle.getArea());
        System.out.println("Area of Triangle: " + triangle.getArea());
    }
}
