import java.util.*;
class Employee
{
	private String empName;
	private String empNo;
    private int dependentCnt;
	public Employee(String name,String eno,int depcnt)
	{
		empName=name;
		empNo=eno;
		dependentCnt=depcnt;
	}
	public void showEmpDetails()
	{
		System.out.println("Employee no:"+empNo+"\nEmployee name:"+empName);
	}
    public int depCount()
	{
		return dependentCnt;
	}
}
class EmpTest
{
	public static void main(String args[])
	{
		int n,dep,count;
		String name,no;
		System.out.println("Enter the no. of employees");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		Employee e1[]=new Employee[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the employee name,no. and dependent count");
			name=sc.next();
			no=sc.next();
			dep=sc.nextInt();
			e1[i]=new Employee(name,no,dep);
		}
		System.out.println("The details of employees with more than 2 dependants");
		for(int i=0;i<n;i++)
		{
			count=e1[i].depCount();
			if(count>2)
			{
				e1[i].showEmpDetails();
			}
		}
	}
}