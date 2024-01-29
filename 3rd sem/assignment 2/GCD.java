import java.util.*;
class GCD
{
	public static void main(String args[])
	{
		int a,b,gcd=0;
		System.out.println("Enter any two numbers");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		for(int i=2;i<=a;i++)
		{
			if(a%i==0 && b%i==0)
			{
				gcd=i;
			}
		}
		if(gcd>0)
		{
			System.out.println("The gcd of the numbers is "+gcd);
		}
		else
		{
			System.out.println("The gcd of the numbers is 1");
		}
	}
}