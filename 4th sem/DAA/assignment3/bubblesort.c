#include<stdio.h>
#include<time.h>
#include<stdlib.h>

void bubbleSort(int A[],int n)
{
	int i,j,t;
	for(i=0;i<n;i++){
		for(j=0;j<n-i-1;j++){
			if(A[j]>A[j+1])
			{
				t = A[j];
				A[j] = A[j+1];
				A[j+1] = t;
			}
		}
	}
}

void main()
{
	int n,i;
	printf("Enter the number of elements: ");
	scanf("%d",&n);
	int A[n];
	printf("Enter the array: ");
	for(i=0;i<100;i++)
	{
		A[i]=rand()%100;
	}

	double total_time_taken;
	clock_t Start,end;
	Start=clock();

	//call the function
	bubbleSort(A,n);

	end=clock();
	total_time_taken=((double)(end-Start))/CLOCKS_PER_SEC;
	printf("\nTotal time is %f",total_time_taken);
	printf("The sorted array is: ");
	for(i=0;i<n;i++)
	{
		printf("%d", A[i]);
	}
	printf("\n");
}

