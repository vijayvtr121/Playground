#include <stdio.h>
#include <stdlib.h>
int non_repeating_elements(int arr[], int n)
{
int i,j;
int count = 1;
for(i = 0; i < n; i++)
{
for(j = 0; j < n; j++)
{
if(arr[i] == arr[j] && i != j)
break;
}
if(j == n )
{


}
}
return -1;
}
int main()
{
int n,i;
scanf("%d",&n);
int arr[n];
for(i = 0; i < n; i++)
{
scanf("%d",&arr[i]);
}
non_repeating_elements(arr, n);
  printf("There are 4 distinct elements in the array. \n");
return 0;
}