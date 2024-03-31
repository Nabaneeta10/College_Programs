import Org.Shapes.*;
import java.util.*;
class TestShape
{
	public static void main(String args[])
	{
		double a1,a,b,c,r;
		System.out.println("Enter the side of square");
		Scanner sc=new Scanner(System.in);
		a1=sc.nextDouble();
		System.out.println("Enter the sides of triangle");
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		System.out.println("Enter the radius of circle");
		r=sc.nextDouble();
		Square s1=new Square(a1);
		s1.area();
		s1.perimeter();
		Triangle t1=new Triangle(a,b,c);
		t1.area();
		t1.perimeter();		
		Circle c1=new Circle(r);
		c1.area();
		c1.perimeter();
	}
}