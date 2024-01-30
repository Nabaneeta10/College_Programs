import java.util.*;
class Factorial
{
	static void fact(int num)
	{
		int factorial=1;
		for(int i=1;i<=num;i++)
		{
			factorial=factorial*i;
		}
		System.out.println("The factorial is "+factorial);
	}
	public static void main(String args[])
	{
		int num;
		System.out.println("Enter any number");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		fact(num);
	}
}