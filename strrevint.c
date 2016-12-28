#include<stdio.h>
#include<conio.h>
int main()
{
char n[10];
printf("Enter the int :");
scanf("%s",&n);
printf("The reverse of the int is %s",strrev(n));
getch();
return 0;
}
