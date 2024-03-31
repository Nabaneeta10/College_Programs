package BTech;
public class Student
{
	int rollNo;
	String name;
	int mark1,mark2,mark3;
	int total;
	public Student(int roll,String n,int m1,int m2,int m3,int Total)
	{
		rollNo=roll;
		name=n;
		mark1=m1;
		mark2=m2;
		mark3=m3;
		total=Total;
	}
	public void display()
	{
		System.out.println("Roll no.:"+rollNo);
		System.out.println("Name:"+name);
		System.out.println("------MARKS------");
		System.out.println("Sub 1:"+mark1);
		System.out.println("Sub 2:"+mark2);
		System.out.println("Sub3:"+mark3);
		System.out.println("Total:"+total);
		System.out.println("Percentage:"+total/3);
	}
}