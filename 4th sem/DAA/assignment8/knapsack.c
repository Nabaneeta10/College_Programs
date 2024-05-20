
#include <stdio.h>
#include <stdlib.h>

void greedy_knapsack(int m, int n);
int main()
{
    int m, n;
    printf("Enter size of knapsack:");
    scanf("%d", &m);
    printf("Enter number of objects:");
    scanf("%d", &n);
    greedy_knapsack(m, n);
    return 0;
}

void greedy_knapsack(int m, int n)
{
    int i;
    float profits[n], weights[n], ratios[n], x[n];
    printf("Enter profits and weights for each object:\n");
    for(i=1;i<=n;i++) {
        scanf("%f %f", &profits[i], &weights[i]);
        ratios[i]=profits[i]/weights[i];
    }
    for(i=1;i<=n;i++)
    {
        for(int j=1;j<=n-i;j++)
        {
            if(ratios[j]<ratios[j+1])
            {
                float temp=ratios[j];
                ratios[j]=ratios[j+1];
                ratios[j+1]=temp;

                temp=profits[j];
                profits[j]=profits[j+1];
                profits[j+1]=temp;

                temp=weights[j];
                weights[j]=weights[j+1];
                weights[j+1]=temp;
            }
        }
    }
    for(i=1;i<=n;i++)
    {
        x[i]=0;
    }
    float u=m;
    float totalProfit=0,totalWeight=0;
    for(i=1;i<=n;i++)
    {
        if(weights[i]>u) break;
        x[i]=1;
        totalProfit+=profits[i];
        totalWeight+=weights[i];
        u-=weights[i];
    }
    if(i<=n)
    {
        x[i]=u/weights[i];
        totalProfit+=x[i]*profits[i];
        totalWeight+=x[i]*weights[i];
    }

    printf("Selected fraction of each item:\n");
    for(i=1;i<=n;i++)
    {
        printf("%f ",x[i]);
    }
    printf("\n");
    printf("Total profit is: %f\n", totalProfit);
    printf("Total weight is: %f\n", totalWeight);
}
