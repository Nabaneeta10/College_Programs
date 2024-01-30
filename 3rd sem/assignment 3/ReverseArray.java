import java.util.*;
class ReverseArray
{
	public static void main(String args[])
	{
		int size,tmp;
		System.out.println("Enter the size of array");
		Scanner sc=new Scanner(System.in);
		size=sc.nextInt();
		int ar[]=new int[size];
		System.out.println("Enter the elements");
		for(int i=0;i<size;i++)
		{
			ar[i]=sc.nextInt();
		}
		for(int i=0;i<size/2;i++)
		{
			tmp=ar[i];
			ar[i]=ar[size-i-1];
			ar[size-i-1]=tmp;
		}
		System.out.println("The reversed array is");
		for(int i=0;i<size;i++)
		{
			System.out.print(ar[i]+" ");
		}
	}
}