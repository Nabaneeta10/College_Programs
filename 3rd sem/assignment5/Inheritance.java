import java.util.*;
class Person
{
	String name;
	int age;
	public Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
}
class Employee extends Person
{
	int eno;
	double basic,da,hra,gsalary;
	public Employee(int empNo,double bsalary,String name,int age)
	{
		super(name,age);
		eno=empNo;
		basic=bsalary;
	}
	public void calculate()
	{
		da=2*basic/100;
		hra=3*basic/100;
		gsalary=basic+da+hra;
	}
	public void show()
	{
		System.out.println("Name:"+name+"\nAge:"+age+"\nGross salary:"+gsalary);
	}
}
class Inheritance
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Employee e1[]=new Employee[3];
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter the name and age");
			String name=sc.next();
			int age=sc.nextInt();
			System.out.println("Enter the empNo and basic salary");
			int empNo=sc.nextInt();
			int bsalary=sc.nextInt();
			e1[i]=new Employee(empNo,bsalary,name,age);
			e1[i].calculate();
		}
		for(int i=0;i<3;i++)
		{
			e1[i].show();
		}
	}
}
		