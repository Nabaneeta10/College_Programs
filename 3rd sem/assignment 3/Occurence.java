import java.util.*;
class Occurence
{
	public static void main(String args[])
	{
		int size;
		System.out.println("Enter the size of array");
		Scanner sc=new Scanner(System.in);
		size=sc.nextInt();
		int ar[]=new int[size];
		int occ[]=new int[size];
		System.out.println("Enter the elements");
		for(int i=0;i<size;i++)
		{
			ar[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			int count=1;
			for(int j=i+1;j<size;j++)
			{
				if(ar[i]==ar[j])
				{
					count++;
					occ[j]=-1;
				}
			}
			if(occ[i]!=-1)
			{
				occ[i]=count;
			}
		}
		for(int i=0;i<occ.length;i++)
		{
			if(occ[i]!=-1)
			{
				System.out.println("The occurence of "+ar[i]+" is "+occ[i]);
			}
		}
	}
}