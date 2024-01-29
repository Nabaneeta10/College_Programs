import java.util.*;
class SmallestArray
{
	public static void main(String args[])
	{
		int small,large,size;
		System.out.println("Enter the size of array");
		Scanner sc=new Scanner(System.in);
		size=sc.nextInt();
		int ar[]=new int[size];
		System.out.println("Enter the elements");
		for(int i=0;i<size;i++)
		{
			ar[i]=sc.nextInt();
		}
		small=large=ar[0];
		for(int i=1;i<ar.length;i++)
		{
			if(ar[i]<small)
			{
				small=ar[i];
			}
			if(ar[i]>large)
			{
				large=ar[i];
			}
		}
		System.out.println("The largest number is "+large+" and the smallest number is "+small);
	}
}