#include<stdio.h>
#include<stdlib.h>
#include<time.h>


void insersionSort(int A[],int n)
{
	int i,j,key;
	for(i=1;i<n;i++)
	{
		key = A[i];
		for(j=i-1;j>=0;j--)
		{
			if(key<A[j])
				A[j+1]=A[j];
			else
				break;
		}
		A[j+1]=key;

	}
}

void main()
{
	int n,i;
	printf("Enter the number of elements : ");
	scanf("%d",&n);
	int A[n];
	printf("Enter the array : ");
	for(i=0;i<n;i++)
	{
		A[i]=rand()%100;
	}

	double total_time_taken;
	clock_t start,end;
	start=clock();

	//call the function
	insersionSort(A,n);

	end=clock();
	total_time_taken=((double)(end-start))/CLOCKS_PER_SEC;
	printf("\nTotal time is %f",total_time_taken);

	printf("The sorted array is : ");
	for(i=0;i<n;i++){
		printf("%d ",A[i]);
	}
	printf("\n");
}

