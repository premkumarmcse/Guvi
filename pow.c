#include<stdio.h>
#include<conio.h>
main()
{
int n,a,b;
printf("Enter the base value: ");
scanf("%d",&b);
scanf("%d",&n);
a=pow(b,n);
printf("The pow value is :%d",a);
getch();
return 0;
}
