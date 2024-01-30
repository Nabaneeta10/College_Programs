import java.util.*;
class Duplicates
{
	public static void main(String args[])
	{
		int size,tmp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]>arr[j])
				{
					tmp=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
		System.out.println("The sorted array is");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.print("\n");
		for(int i=0;i<size;i++)
		{
			int count=0;
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]==arr[j])
				{
					for(int k=j;k<size-1;k++)
					{
						arr[k]=arr[k+1];
					}
					size--;
				}
			}
		}
		System.out.println("Array after removing duplicates is");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}