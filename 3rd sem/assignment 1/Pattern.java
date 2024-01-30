import java.util.*;
class Pattern
{
	public static void main(String args[])
	{
		int n;
		System.out.println("Enter any number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("The pattern is");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.print("\n");
		}
	}
}