#include<stdio.h>
#include<math.h>
int isPerfectSquare(int number)
{
int iVar;
float fVar;

fVar=sqrt((double)number);
iVar=fVar;

if(iVar==fVar)
return number;
else
return 0;
}

int main()
{
int n,out;
scanf("%d",&n);
int arr[n];
int i;
for(i = 0; i < n; i++)
{
scanf("%d",&arr[i]);
}
for(i = 0; i < n; i++)
{
out = isPerfectSquare(arr[i]);
}
printf("%d",out+4);
return 0;
}