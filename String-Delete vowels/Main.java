#include <stdio.h>
int check_vowel(char);
int main()
{
char s[100], t[100];
int c, d = 0;
gets(s);
for(c = 0; s[c] != '\0'; c++)
{
if(check_vowel(s[c]) == 0)
{
t[d] = s[c];
d++;
}
}
t[d] = '\0';
strcpy(s, t);
printf("%s\n", s);
return 0;
}
int check_vowel(char ch)
{
if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch =='o' || ch=='O' || ch == 'u' || ch == 'U')
return 1;
else
return 0;
}