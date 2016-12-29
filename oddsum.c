#include"stdio.h"
main()
{
int i,sum=0;
for(i=1;i<=20;i++)
{
if(i%2!=0)
sum=sum+i;
}printf("sum=%d",sum);
}
