#include<stdio.h>
#include<time.h>
#include<stdlib.h>

int t[10];

int min(int a,int b)
{
	return a<b?a:b;
}

int max(int a,int b)
{
	return a>b?a:b;
}

void exchange(int a[],int i, int  j)
{
	int t = a[i];
	a[i] = a[j];
	a[j] = t;
}

int partition(int a[],int p,int r)
{
        int pivot,i,j,temp,rnd=p+rand()%(r-p);
        j=p;
        i=j;
	exchange(a,r,rnd);
	

        pivot = a[r];
        while(j<r){
                if(a[j]<=a[r]){
                        temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                        i++;
                }
                j++;
        }
        temp = a[i];
        a[i] = a[r];
        a[r] = temp;
        return i;
}

void quicksort(int a[],int p,int r)
{
	if(p<r)
	{
		int pvt = partition(a,p,r);
		quicksort(a,p,pvt-1);
		quicksort(a,pvt+1,r);
	}
}


void main()
{
	int n,i;
	printf("Enter the number of elements : ");
	scanf("%d",&n);
	int a[n];
	//printf("Enter the array : ");
	for(i=0;i<n;i++)
	{
		a[i] = rand()%n;
	}
	double total_time_taken;
	clock_t start,end;
	start=clock();

	//call the function
	quicksort(a,0,n-1);

	end=clock();
	total_time_taken=((double)(end-start))/CLOCKS_PER_SEC;
	printf("\nTotal time is %f",total_time_taken);

	printf("The sorted array is : ");
	for(i=0;i<n;i++)
	{
		printf("%d ",a[i]);
	}
	printf("\n");
}

