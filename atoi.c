#include<stdio.h>
void main()
{
int n;
char buf[15];
int i;
printf("Enter the dec no:");
scanf("%d",&n);
itoa(n,buf,2);
printf("%s\n",buf);
}
