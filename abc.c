#include<stdio.h>
#include<conio.h>
int main()
{
int a,b,c;
printf("Enter the value for a,b,c ");
scanf("%d%d%d",&a,&b,&c);
if(a>b && a>c)
{
printf("A is greater");
}
else if(b>a && b>c)
printf("B is greater");
else
printf("C is greater");
getch();
return 0;
}
