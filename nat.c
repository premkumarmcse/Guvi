#include<stdio.h>
#include<conio.h>
main()
{
int i,num,sum=0;
printf("Enter the num:");
scanf("%d",&num);
for(i=0;i<=num;i++)
{sum+=i;
}printf("The sum of %d=%d",num,sum);
getch();
return 0;
}
