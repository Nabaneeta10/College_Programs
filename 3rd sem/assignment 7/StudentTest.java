import BTech.*;
import java.util.*;
class StudentTest
{
	public static void main(String args[])
	{
		int rollNo;
		String name;
		int m1,m2,m3,total;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter roll no:");
		rollNo=sc.nextInt();
		System.out.print("Enter name:");
		name=sc.next();
		System.out.print("Enter 3 sub marks:");
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
		total=m1+m2+m3;
		Student s1=new Student(rollNo,name,m1,m2,m3,total);
		s1.display();
	}
}