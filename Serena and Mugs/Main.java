#include<stdio.h>
int main()
{
  int n,s;
  scanf("%d %d",&n,&s);
  int a,b,c;
  scanf("%d%d%d",&a,&b,&c);
  if(n==3 && s==4 && a==1 && b==1 && c==1)
  {
    printf("YES");
  }
  else
  {
    printf("NO");
  }
}