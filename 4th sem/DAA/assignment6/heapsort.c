#include<stdio.h>
#include<time.h>
#include<stdlib.h>
void max_heapify(int arr[], int n, int i)
{
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

            if( left <= n && arr[left] > arr[largest]){
                    largest = left;
            }
            else{
                    largest=i;
            }
            if( right < n && arr[right] > arr[largest]){
                   largest=right;
            }
                           if (largest != i)
                           {
                                   int temp = arr[i];
                                   arr[i] = arr[largest];
                                   arr[largest] = temp;
                                   max_heapify(arr, n, largest);
                           }
}
void build_maxheap(int arr[], int n)
{
        for (int i = n / 2 - 1; i >= 0; i--)
                max_heapify(arr, n, i);
}
void heapsort(int arr[], int n)
{
        build_maxheap(arr, n);
        for (int i = n - 1; i > 0; i--)
        {
                int temp = arr[0];
                arr[0] = arr[i];
                arr[i] = temp;
                max_heapify(arr, i, 0);
        }
}
int main()  {
        int n, i;
        printf("Enter the number of elements: ");
        scanf("%d", &n);
        int a[n];
        double total_time_taken;
        clock_t start, end;
        start = clock();
        heapsort(a, n);
        end = clock();
        total_time_taken = ((double)(end - start)) / CLOCKS_PER_SEC;
        printf("\nTotal time taken for sorting: %f seconds\n", total_time_taken);
        printf("\n");
        printf("Sorted array: ");
        for (i = 1; i <= n; i++) {
                a[i] = rand() % n;
                printf("%d ", a[i]);
        }
        printf("\n");
        return 0;
}
