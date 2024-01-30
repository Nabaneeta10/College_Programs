import java.util.*;
class PrimeNo
{
	public static void main(String args[])
	{
		int count=0;
		System.out.println("The prime numbers between 1 and 100 are");
		for(int i=2;i<=100;i++)
		{
			int flag=0;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					flag++;
				}
			}
			if(flag==0)
			{
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println("\nThe no of prime nos. between 1 and 100 are "+count);
	}
}