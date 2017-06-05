#include<stdio.h>
#include<conio.h>
main()
{
int n;
printf("Enter the digit\n");
scanf("%d",&n);
switch(n)
{
case 2:
printf("ABC");
break;

case 3:
printf("DEF");
break;

case 4:
printf("GHI");
break;

case 5:
printf("JKL");
break;

case 6:
printf("MNO");
break;

case 7:
printf("PQRS");
break;

case 8:
printf("TUV");
break;

case 9:
printf("WXYZ");
break;

default:
    printf(" ");
}
return 0;
}
