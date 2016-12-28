#include<stdio.h>
#include<conio.h>
main()
{
    float t1,t2,n,min=0;
    printf("Enter the time 1:");
    scanf("%f",&t1);
    printf("Enter the time 2:");
    scanf("%f",&t2);
    n=t2-t1;
    printf("\nThe difference b/w t1&t2 is %f",n);
    min=n*60;
    printf("\nThe total mins is %f",min);
    getch();
    return 0;
}
