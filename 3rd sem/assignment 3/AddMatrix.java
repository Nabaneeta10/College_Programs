import java.util.*;
class AddMatrix
{
	public static void main(String args[])
	{
		int rows,cols;
		System.out.println("Enter the no. of rows and columns");
		Scanner sc=new Scanner(System.in);
		rows=sc.nextInt();
		cols=sc.nextInt();
		int ar1[][]=new int[rows][cols];
		int ar2[][]=new int[rows][cols];
		System.out.println("Enter the elements of 1st matrix");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				ar1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the elements of 2nd matrix");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				ar2[i][j]=sc.nextInt();
			}
		}
		System.out.println("The addition of the matrices is");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(ar1[i][j]+ar2[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
}