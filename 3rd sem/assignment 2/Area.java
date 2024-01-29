import java.util.*;
class Area
{
	public static void main(String args[])
	{
		int a,b,c,s;
		double area;
		System.out.println("Enter the three sides of the triangle");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		s=(a+b+c)/2;
		area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("The area of the triangle is "+area);
	}
}