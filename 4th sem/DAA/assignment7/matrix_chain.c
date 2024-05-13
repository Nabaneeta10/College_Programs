#include<stdio.h>
#include<limits.h>

#define MAX_SIZE 10

int matrix_chain_mul(int p[], int size);
void print_optimal_paren(int s[][MAX_SIZE],int x,int y);
int main()
{
    int p[]={30,35,15,5,10,20,25};
    int size = sizeof(p) / sizeof(p[0]);
    matrix_chain_mul(p,size);
    return 0;
}

int matrix_chain_mul(int p[], int size)
{
    int i,j,k,l,q,n=size-1;
    int m[MAX_SIZE][MAX_SIZE];
    int s[MAX_SIZE][MAX_SIZE];
    for(i=0;i<MAX_SIZE;i++)
    {
            m[i][i]=0;
            s[i][i]=0;
    }
    for(l=2;l<=n;l++)
    {
        for(i=1;i<=n-l+1;i++) {
            j=i+l-1;
            m[i][j]=INT_MAX;
            for(k=i;k<=j-1;k++) {
                q=m[i][k]+m[k+1][j]+p[i-1]*p[k]*p[j];
                if(q<m[i][j]) {
                    m[i][j]=q;
                    s[i][j]=k;
                    printf("%d ",m[i][j]);
                    printf("%d ",s[i][j]);
                }
            }
        }
    }
    print_optimal_paren(s,1,n);
    return 0;
}

void print_optimal_paren(int s[][MAX_SIZE],int x,int y)
{
    int i=x,j=y;
    if(i==j)
    {
        printf("A%d",i);
    }
    else
    {
        printf("(");
        print_optimal_paren(s,i,s[i][j]);
        print_optimal_paren(s,s[i][j]+1,j);
        printf(")");
    }
}
