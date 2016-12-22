#include<stdio.h>
#include<string.h>
#include<conio.h>
int main()
{
char ch;
int i;
printf("Enter the character:");
scanf("%c",&ch);
if(ch>='a'&&ch<='z' || ch>='A'&&ch<='Z')
{
printf("Alphabet");
}else
printf("not an alphabet");
getch();
return 0;
}
