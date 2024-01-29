import java.util.*;
class Reverse
{
	public static void main(String args[])
	{
		int n,reverse=0,digit;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		n=sc.nextInt();
		while(n>0)
		{
			digit=n%10;
			reverse=reverse*10+digit;
			n=n/10;
		}
		System.out.println("The reverse of the number is "+reverse);
	}
}