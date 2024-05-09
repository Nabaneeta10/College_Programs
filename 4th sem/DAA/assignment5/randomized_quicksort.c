#include <stdio.h>
#include <time.h>
#include <stdlib.h>

void exchange(int a[], int i, int j) {
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
}

int partition(int a[], int p, int r) {
    int x = a[r];
    int i = p - 1;
    for (int j = p; j <= r - 1; j++) {
        if (a[j] <= x) {
            i++;
            exchange(a, i, j);
        }
    }
    exchange(a, i + 1, r);
    return i + 1;
}

int randomized_partition(int a[], int p, int r) {
    int i = rand() % (r - p + 1) + p; 
    exchange(a, i, r); 
    return partition(a, p, r);
}

void randomized_quicksort(int a[], int p, int r) {
    if (p < r) {
        int pvt = randomized_partition(a, p, r);
        randomized_quicksort(a, p, pvt - 1);
        randomized_quicksort(a, pvt + 1, r);
    }
}

int main() {
    int n, i;
    printf("Enter the number of elements: ");
    scanf("%d", &n);
    int a[n];

    double total_time_taken;
    clock_t start, end;
    start = clock();

    randomized_quicksort(a, 1, n);
    
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

