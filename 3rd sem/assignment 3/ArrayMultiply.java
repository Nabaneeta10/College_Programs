import java.util.*;
class ArrayMultiply
{
	public static void main(String args[])
	{
		int r1,r2,c1,c2;
		System.out.println("Enter the no. of rows and columns of 1st matrix");
		Scanner sc=new Scanner(System.in);
		r1=sc.nextInt();
		c1=sc.nextInt();
		System.out.println("Enter the no. of rows and columns of 2nd matrix");
		r2=sc.nextInt();
		c2=sc.nextInt();
		if(c1!=r2)
		{
			System.out.println("Matrix multiplication is not possible");
		}
		else
		{
			int arr1[][]=new int[r1][c1];
			int arr2[][]=new int[r2][c2];
			int arr[][]=new int[r1][c2];
			System.out.println("Enter the elements of 1st matrix");
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c1;j++)
				{
					arr1[i][j]=sc.nextInt();
				}
			}
			System.out.println("Enter the elements of 2nd matrix");
			for(int i=0;i<r2;i++)
			{
				for(int j=0;j<c1;j++)
				{
					arr2[i][j]=sc.nextInt();
				}
			}
			System.out.println("The muliplication of the arrays is");
			for(int i=0;i<r1;i++)
			{
				arr[i][0]=0;
				for(int j=0;j<r1;j++)
				{
					for(int k=0;k<c2;k++)
					{
						arr[i][j]+=arr1[i][k]*arr2[k][j];
					}
					System.out.print(arr[i][j]+" ");
				}
				System.out.print("\n");
			}
		}
	}
}
					