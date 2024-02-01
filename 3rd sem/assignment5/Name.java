import java.util.*;
class GFather
{
	String fname;
	GFather(String name)
	{
		fname=name;
	}
}
class Father extends GFather
{
	String lname;
	Father(String name,String fname)
	{
		super(fname);
		lname=name;
	}
}
class Son extends Father
{
	String mname;
	Son(String name,String lname,String fname)
	{
		super(lname,fname);
		mname=name;
	}
	void show()
	{
		System.out.println(fname+" "+mname+" "+lname);
	}
}
class Name
{
	public static void main(String args[])
	{
		String fname,mname,lname;
		System.out.println("Enter the first,middle,last name");
		Scanner sc=new Scanner(System.in);
		fname=sc.next();
		mname=sc.next();
		lname=sc.next();
		Son s1=new Son(mname,lname,fname);
		s1.show();
	}
}