import java.util.*;
abstract class Figure
{
	abstract void area();
}
class Circle extends Figure
{
	double radius,area;
	Circle(double r)
	{
		radius=r;
	}
	void area()
	{
		area=3.14*radius*radius;
	}
	void show()
	{
		System.out.println("Area of circle:"+area);
	}
}
class Triangle extends Figure
{
	double base,height,area;
	Triangle(double b,double h)
	{
		base=b;
		height=h;
	}
	void area()
	{
		area=0.5*base*height;
	}
	void show()
	{
		System.out.println("Area of triangle:"+area);
	}
}
class Rectangle extends Figure
{
	double length,breadth,area;
	Rectangle(double l,double b)
	{
		length=l;
		breadth=b;
	}
	void area()
	{
		area=length*breadth;
	}
	void show()
	{
		System.out.println("Area of rectangle:"+area);
	}
}
class Area
{
	public static void main(String args[])
	{
		double r,b,h,l,br;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the radius of circle:");
		r=sc.nextDouble();
		Circle f1=new Circle(r);
		System.out.print("Enter the base and height of triangle:");
		b=sc.nextDouble();
		h=sc.nextDouble();
		Triangle f2=new Triangle(b,h);
		System.out.print("Enter the length and breadth of rectangle:");
		l=sc.nextDouble();
		br=sc.nextDouble();
		Rectangle f3=new Rectangle(l,br);
		f1.area();
		f2.area();
		f3.area();
		f1.show();
		f2.show();
		f3.show();
	}
}		