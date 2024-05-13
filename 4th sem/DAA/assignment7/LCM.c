#include<stdio.h>
char c[20][20];
int b[20][20];
void LCS_length(char x[],char y[],int m,int n)
{
        int i,j;
        for(i=1;i<=m;i++)
        {
                c[i][0]=0;
        }
        for(i=1;i<=n;i++)
        {
                c[0][j]=0;
        }
        for(i=1;i<=m;i++)
        {
                for(j=1;j<=n;j++)
                {
                        if(x[i]==y[j])
                        {
                                c[i][j]=c[i-1][j-1]+1;
                                b[i][j]=1;
                        }
                        else if(c[i-1][j]>=c[i][j-1])
                        {
                                c[i][j]=c[i-1][j];
                                b[i][j]=2;
                        }
                        else
                        {
                                c[i][j]=c[i][j-1];
                                b[i][j]=3;
                        }
                }
        }
}
void print_LCS(char x[],int i,int j)
{
        if(i==0 || j==0)
        {
		return;
        }
        if(b[i][j]==1)
        {
                print_LCS(x,i-1,j-1);
                printf("%c ",x[i]);
        }
        else if(b[i][j]==2)
        {
                print_LCS(x,i-1,j);
        }
        else
        {
                print_LCS(x,i,j-1);
        }
}
int main()
{
        char x[20],y[20];
        int i,m,n;
        printf("Enter string1:");
        for(i=1;i<=m;i++)
        {
                scanf(" %c",&x[i]);
        }
        printf("Enter string2:");
        for(i=1;i<=n;i++)
        {
                scanf(" %c",&y[i]);
        }
        print_LCS(x,m,n);
	int length = LCS_length(x, y, m, n);
	printf("Length of Longest Common Subsequence: %d\n", length);
        return 0;
}



