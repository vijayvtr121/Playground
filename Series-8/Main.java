#include<stdio.h>
int main()
{
int n,i,c=0,j;
  scanf("%d",&n);
  int count;
  
  
   for(i=100;;i++)
   {
     count=0;
     for(j=1;j<=i;j++)
     {
       if(i%j==0)
       {
         count++;
       }
     }
     if(count==2)
     {
       printf("%d ",i);
       c=c+1;
       if(c==n)
         break;
     }
     
   
  }
}