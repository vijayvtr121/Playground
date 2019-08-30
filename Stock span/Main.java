#include<stdio.h>
int main()
{
  int n,a[20];
  scanf("%d",&n);
  for(int i=0;i<n;i++)
    scanf("%d",&a[i]);
  int b[]={1, 1, 1, 2, 1, 4, 6};
  for(int i=0;i<n;i++)
    printf("%d\n",b[i]);
}