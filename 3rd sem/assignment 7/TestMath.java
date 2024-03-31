import BTech.Arithmetic.*;
import java.util.*;
class TestMath
{
	public static void main(String args[])
	{
		int a,b;
		System.out.println("Enter any two numbers");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		MyMath m1=new MyMath(a,b);
		m1.add();
		m1.sub();
		m1.mul();
		m1.div();
		m1.mod();
	}
}