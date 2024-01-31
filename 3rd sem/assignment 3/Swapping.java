class Swapping
{
	public static void main(String args[])
	{
		int A[]={1,2,3,9,10};
		int B[]={6,7,8,4,5};
		if(A.length!=B.length)
		{
			System.out.println("Invalid");
		}
		else
		{
			int arr1[]=new int[A.length];
			int arr2[]=new int[A.length];
			int size=A.length;
			for(int i=0;i<size-2;i++)
			{
				arr1[i]=A[i];
				arr2[i]=B[i];
			}
			for(int i=size-2;i<size;i++)
			{
				arr1[i]=B[i];
				arr2[i]=A[i];
			}
			System.out.println("The new arrays are");
			for(int i=0;i<size;i++)
			{
				System.out.print(arr1[i]+" ");
			}
			System.out.print("\n");
			for(int i=0;i<size;i++)
			{
				System.out.print(arr2[i]+" ");
			}
		}
	}
}