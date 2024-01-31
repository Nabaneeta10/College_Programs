import java.util.*;
class Employee
{
	String empName;
	int empNo;
	double basicSal,da,hra,grossSal;
    public Employee(String name,int no,double basic)
	{
        empName=name;
        empNo=no;
        basicSal=basic;
    }
	public void calGrossSal()
	{
        da=0.2*basicSal;
        hra=0.1*basicSal;
        grossSal=basicSal+da+hra;
    }
	public void showEmpDetails()
	{
        System.out.println("Employee Details");
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Number: " + empNo);
        System.out.println("Basic Salary: $" + basicSal);
        System.out.println("DA: $" + da);
        System.out.println("HRA: $" + hra);
        System.out.println("Gross Salary: $" + grossSal);
    }
}

public class Salary 
{
    public static void main(String[] args)
	{
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter details for Employee 1:\nEnter employee name: ");
        String empName1=sc.next();
        System.out.print("Enter employee no:");
        int empNo1=sc.nextInt();
        System.out.print("Enter basic salary: $");
        double basic1=sc.nextDouble();
		Employee employee1 = new Employee(empName1, empNo1, basic1);
        employee1.calGrossSal();
		
        System.out.print("\nEnter details for Employee 2:\nEnter employee name: ");
        String empName2=sc.next();
        System.out.print("Enter employee no: ");
        int empNo2=sc.nextInt();
        System.out.print("Enter basic salary: $");
        double basic2 = sc.nextDouble();
		Employee employee2 = new Employee(empName2, empNo2, basic2);
        employee2.calGrossSal();

        System.out.println("\nDetails of all employees:");
        employee1.showEmpDetails();
        employee2.showEmpDetails();
	}
}