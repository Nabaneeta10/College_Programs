
#include<stdio.h>

int linearSearch(int arr[], int n, int ele)
{
         for(int i=0;i<n;i++){

        if(arr[i]==ele){
                return i;
        }
         }
         return -1;
}

int main()
{
        int i,ele,n;
    printf("Enter the number of elements : ");
    scanf("%d",&n);
    int arr[n];

    printf("Enter array elements : ");
    for(i=0;i<n;++i){
        scanf("%d",&arr[i]);
    }
    printf("Enter element to search : ");
    scanf("%d",&ele);
    int result = linearSearch(arr, n, ele);
    if (result != -1) {
        printf("Element found at index %d\n", result);
    } else {
        printf("Element not found\n");
    }
}
