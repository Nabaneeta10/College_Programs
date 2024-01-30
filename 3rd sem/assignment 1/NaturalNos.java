import java.util.*;
class NaturalNos
{
	public static void main(String args[])
	{
		int n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			sum+=i;
		}
		System.out.println("The sum of natural numbers is "+sum);
	}
}