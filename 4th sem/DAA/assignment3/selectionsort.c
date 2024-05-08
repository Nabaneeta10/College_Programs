#include<stdio.h>
#include<stdlib.h>
#include<time.h>

void SelectionSort(int A[],int n)
{
	int i,j,min,tmp;
	for(i=0;i<n-1;i++)
	{
		min=i;
		for(j=i+1;j<n;j++)
		{
			if(A[i]>A[j])
			{
				min=j;
			}
		}
		tmp=A[i];
		A[i]=A[min];
		A[min]=tmp;
	}
	printf("The sorted array is:");
	for(i=0;i<n;i++)
	{
		printf("%d ",A[i]);
	}
}
int main()
{
	int n,i;
	printf("Enter the size of array:");
	scanf("%d",&n);
	int A[n];
	printf("Enter the elements:");
	for(i=0;i<n;i++)
	{
		A[i]=rand()%100;
	}

	double total_time_taken;
	clock_t start,end;
	start=clock();

	//call the function
	SelectionSort(A,n);

	end=clock();
	total_time_taken=((double)(end-start))/CLOCKS_PER_SEC;
	 printf("\nTotal time is %f",total_time_taken);
	return 0;
}

