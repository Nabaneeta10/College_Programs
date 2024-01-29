import java.util.*;
class EvenAndOdd
{
	public static void main(String args[])
	{
		int m,n,odd=0,even=0;
		System.out.println("Enter the values of m and n");
		Scanner sc=new Scanner(System.in);
		m=sc.nextInt();
		n=sc.nextInt();
		for(int i=m+1;i<n;i++)
		{
			if(i%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
		System.out.println("There are "+even+" even nos and "+odd+" odd nos");
	}
}