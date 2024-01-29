import java.util.*;
class NumberInArray
{
	public static void main(String args[])
	{
		int n,count=0,size;
		System.out.println("Enter the size of array");
		Scanner sc=new Scanner(System.in);
		size=sc.nextInt();
		int ar[]=new int[size];
		System.out.println("Enter the elements");
		for(int i=0;i<size;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("Enter the number to search");
		n=sc.nextInt();
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==n)
			{
				System.out.println("The number is present at index "+i);
				count++;
			}
		}
		if(count==0)
		{
			System.out.println("The number is not in the array");
		}
	}
}