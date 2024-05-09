// Merge Sort

#include<stdio.h>
#include<stdlib.h>
#include<time.h>

void merge(int a[], int p, int q, int r)
{
	int i, j, k;
	int n1 = q-p+1;
	int n2 = r-q;
	int L[n1+1], R[n2+1];
	for (i=1;i<=n1;i++)
	{
		L[i] = a[p+i];
	}
	for (j=1;j<=n2;j++)
	{
		R[j] = a[q+j+1];
	}
	L[n1]=99999;
	R[n2]=99999;
	i = 0;
	j = 0;
	for(k=p;k<=r;k++)
	{
		if (L[i] <= R[j])
		{
			a[k] = L[i];
			i++;
		}
		else
		{
			a[k] = R[j];
			j++;
		}
	}
}
void mergeSort(int a[],int p, int r)
{
	if (p < r)
	{
		int m = (r+p)/2;
		mergeSort(a,p,m);
		mergeSort(a,m+1,r);
		merge(a,p,m,r);
	}
}
int main()
{
	int n, i;
	printf("Please enter the size of the array : ");
	scanf("%d",&n);
	int a[n];
	for(i=1;i<=n;i++)
	{
		a[i]=rand()%n;
	}

	double total_time_taken;
	clock_t start,end;
	start=clock();


	//call the function
	mergeSort(a,0,n-1);

	end=clock();
	total_time_taken=((double)(end-start))/CLOCKS_PER_SEC;
	printf("\nTotal time is %f",total_time_taken);

	printf("Your sorted array is : ");
	for(i=1;i<=n;i++)
	{
		printf(" %d", a[i]);
	}
	printf("\n");
}


