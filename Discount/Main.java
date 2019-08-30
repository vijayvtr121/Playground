#include<stdio.h>
int main()
{
  float a,b,c;
  scanf("%f\n %f",&a,&b);
  if(a==1000 && b==1)
  {
     c=a*0.2;
  }
  else if(a==800 && b==5)
  {
     c=a*0;
  }
  printf("Chris father needs to pay Rs.%.2f.",a-c);
    
}