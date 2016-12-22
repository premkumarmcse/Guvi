#include<stdio.h>
#include<conio.h>
void main()
{
int yy;
printf("\nEnter the year:\t");
scanf("%d",&yy);
if(yy%4==0 || yy%100==0 || yy%400!=0)
printf("The given year %d is a leap year",yy);
else
printf("%d is Not a leap year",yy);
getch();
}
