#include<stdio.h>

void maxi_col(int mat[][3], int m, int n)
{
int i,j;
for(i = 0; i < n; i++)
{
int max = mat[0][i];
for(j = 1; j < m; j++)
{
if(mat[j][i] > max)
{
max = mat[j][i];
}
}
printf("%d\n",max);
}
}
int main()
{
int m, n;
scanf("%d\n %d",&m,&n);
int i, j;
int mat1[m][n];
for(i = 0; i < m; i++)
{
for(j = 0; j < n; j++)
scanf("%d ",&mat1[i][j]);
}

maxi_col(mat1,m,n);
return 0;
}