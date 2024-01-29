import java.util.*;
class Armstrong
{
	public static void main(String args[])
	{
		int n,digit,armstrong=0,num;
		System.out.println("Enter any number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		num=n;
		while(n>0)
		{
			digit=n%10;
			armstrong+=digit*digit*digit;
			n=n/10;
		}
		if(armstrong==num)
		{
			System.out.println("The number is armstrong");
		}
		else
		{
			System.out.println("The number is not armstrong");
		}
	}
}