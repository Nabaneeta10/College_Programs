import java.util.*; 
class Area
{
	public void area(double radius)
	{
		double area=3.14*radius*radius;
		System.out.println("Area of circle:"+area);
	}
	public void area(double length,double breadth)
	{
		double area=length*breadth;
		System.out.println("Area of rectangle:"+area);
	}
}
class Overloading
{
	public static void main(String args[])
	{
		double r,l,b;
		Area a1=new Area();
		System.out.println("Enter the radius of circle");
		Scanner sc=new Scanner(System.in);
		r=sc.nextDouble();
		a1.area(r);
		System.out.println("Enter the length and breadth of rectangle");
		l=sc.nextDouble();
		b=sc.nextDouble();
		a1.area(l,b);
	}
}