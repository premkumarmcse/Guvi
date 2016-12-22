#include<stdio.h>
#include<conio.h>
int main()
{
int i,num,sum=0;
printf("Enter the no:");
scanf("%d",&num);
while(num!=0)
{
i=num%10;
sum=sum+i;
num=num/10;
}
printf("The sum of digit is %d",sum);
return 0;
}
