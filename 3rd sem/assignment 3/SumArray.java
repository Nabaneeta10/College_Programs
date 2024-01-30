import java.util.*;
class SumArray
{
	public static void main(String args[])
	{
		int size,sum=0;
		System.out.println("Enter the size of array");
		Scanner sc=new Scanner(System.in);
		size=sc.nextInt();
		int ar[]=new int[size];
		System.out.println("Enter the elements");
		for(int i=0;i<size;i++)
		{
			ar[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			sum+=ar[i];
		}
		System.out.println("The sum of array elements is "+sum);
	}
}