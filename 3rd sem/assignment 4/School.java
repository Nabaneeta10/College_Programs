import java.util.*;
class Student
{
	int roll,p1,p2,p3;
	String name,grade;
	public void getInfo()
	{
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter roll number: ");
        roll=sc.nextInt();
        System.out.print("Enter name of student:");
        name=sc.next();
        System.out.print("Enter marks of paper 1:");
        p1=sc.nextInt();
        System.out.print("Enter marks of paper 2:");
        p2=sc.nextInt();
        System.out.print("Enter marks of paper 3:");
        p3=sc.nextInt();
    }
	public void calculate()
	{
        double total=(p1+p2+p3)/3;
        if(total>=80)
		{
            grade="A";
        }
		else if (total>=60)
		{
            grade="B";
        }
		else if(total>=40)
		{
            grade="C";
        } 
		else
		{
            grade="Failed";
        }
    }

    public void showDetails()
	{
        System.out.println("\nStudent Details:");
        System.out.println("Roll Number: " + roll);
        System.out.println("Name :" + name);
        System.out.println("Grade: " + grade);
    }
}
class School
{
	public static void main(String args[])
	{
		Student s1= new Student();
		Student s2= new Student();
		Student s3= new Student();
	
		System.out.println("Enter details for Student 1");
		s1.getInfo();
		s1.calculate();
	
		System.out.println("\nEnter details for Student 2");
		s2.getInfo();
		s2.calculate();

		System.out.println("\nEnter details for Student 3");
		s3.getInfo();
		s3.calculate();

		System.out.println("\nDetails for all Students");
		s1.showDetails();
		s2.showDetails();
		s3.showDetails();
	}
}
