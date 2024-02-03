import java.util.*;
class Distance
{
	int x1,y1;
	Distance(int x1,int x2)
	{
		this.x1=x1;
		this.y1=y1;
	}
}
class Euclidean extends Distance
{
	int x2,y2;
	Euclidean(int x2,int y2,int x1,int y1)
	{
		super(x1,y1);
		this.x2=x2;
		this.y2=y2;
	}
	void dis()
	{
		double dist=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		System.out.println("The Euclidean distance is "+dist);
	}
}
class Supremum extends Distance
{
	int x2,y2;
	Supremum(int x2,int y2,int x1,int y1)
	{
		super(x1,y1);
		this.x2=x2;
		this.y2=y2;
	}
	void dis()
	{
		double dist=Math.max(Math.abs(x2-x1),Math.abs(y2-y1));
		System.out.println("The Supremum distance is "+dist);
	}
}
class DistanceCal
{
	public static void main(String args[])
	{
		int x1,y1,x2,y2;
		System.out.println("Enter the coordinates of points");
		Scanner sc=new Scanner(System.in);
		x1=sc.nextInt();
		y1=sc.nextInt();
		x2=sc.nextInt();
		y2=sc.nextInt();
		Euclidean e1=new Euclidean(x2,y2,x1,y1);
		Supremum s1=new Supremum(x2,y2,x1,y1);
		e1.dis();
		s1.dis();
	}
}