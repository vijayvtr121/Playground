#include <stdio.h>
void main()
{
    char string[80];
    int count, nc = 0, sum = 0;
 
    
    scanf("%s", string);
    for (count = 0; string[count] != '\0'; count++)
    {
        if ((string[count] >= '0') && (string[count] <= '9'))
        {
            nc += 1;
            sum += (string[count] - '0');
        }
    }
    
    printf("%d", sum*4);
}