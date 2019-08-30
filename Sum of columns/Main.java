#include<stdio.h>
 int main()
{
    int i, j, rows, columns, a[10][10], Sum;
    scanf("%d\n %d", &i, &j);
    for(rows = 0; rows < i; rows++)
    {
        for(columns = 0; columns < j; columns++)
        {
            scanf("%d", &a[rows][columns]);
        }
    }
    for(rows = 0; rows < i; rows++)
    {
        Sum = 0;
        for(columns = 0; columns < j; columns++)
        {
            Sum = Sum + a[columns][rows];
        }
        printf("The sum of column %d: %d\n",rows+1, Sum );
    }
     return 0;
}