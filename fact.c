#include<stdio.h>
main()
{
    int fact,n,i,a=1;
    printf("enter the number: ");
    scanf("%d",&n);

    for(i=n;i>=1;i--)
        {
            a=a*i;
        }
    printf("%d",a);
}
