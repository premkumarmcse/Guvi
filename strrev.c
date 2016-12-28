#include<stdio.h>
#include<conio.h>
int main()
{
char ch[10];
printf("Enter the string :");
scanf("%s",ch);
printf("The reverse of the string is %s",strrev(ch));
return 0;
getch();
}
