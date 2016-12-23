#include<stdio.h>
#include<conio.h>
main()
{
int a[20],i,n;
printf("Enter the no.of elements :");
scanf("%d",&n);
for(i=0;i<=n;i++)
{
printf("Enter the array elements:");
scanf("%d",&a[i]);
}
for(i=0;i<=n;i++)
{
printf("The array elements are a[%d]=%d\n",i,a[i]);
}return 0;
getch();
}
