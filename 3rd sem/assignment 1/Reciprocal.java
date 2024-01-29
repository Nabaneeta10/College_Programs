import java.util.*;
class Reciprocal
{
	public static void main(String args[])
	{
		int n=0;
		float sum=0,r=0;
		System.out.println("Enter any number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(float i=1;i<=n;i++)
		{
			r=(1/i);
			sum=sum+r;
		}
		System.out.printf("The sum of reciprocals is "+sum);
	}
}