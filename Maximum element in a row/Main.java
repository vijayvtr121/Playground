#include<stdio.h>

void display(int result[], int n)
{
int i;
for(i = 0; i < n; i++)
{
printf("%d\n", result[i]);
}
}

void maxi_row(int mat[][3], int m, int n)
{
int i = 0, j;
int max = 0;
int result[m];
while (i < m)
{
for ( j = 0; j < n; j++)
{
if (mat[i][j] > max)
{
max = mat[i][j];
}
}
result[i] = max;
max = 0;
i++;

}
display(result, m);
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

maxi_row(mat1,m,n);
return 0;
}