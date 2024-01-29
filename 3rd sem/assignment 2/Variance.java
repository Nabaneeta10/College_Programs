import java.util.*;
class Variance
{
	public static void main(String args[])
	{
		int size,sum=0,mean,deviation=0,variance,sv;
		System.out.println("Enter the no. of elements");
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
		mean=sum/size;
		for(int i=0;i<size;i++)
		{
			deviation+=Math.pow(ar[i]-mean,2);
		}
		variance=deviation/size;
		sv=(int)Math.sqrt(variance);
		System.out.println("The variance is "+variance+" and standard variance is "+sv);
	}
}