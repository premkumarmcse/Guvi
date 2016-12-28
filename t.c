#include<stdio.h>
#include<conio.h>
main()
{
long int a,b,c,d;
int n;
printf("Enter the base:1\t");
scanf("%ld",&a);
printf("Enter the base2:\t");
scanf("%ld",&b);
printf("Enter the value for n:\t");
scanf("%d",&n);
      switch(n)
      {
      case 0:
        c=a/b;
        if(c==0.1)
        {
            d=c*10;
            printf("%ld",d);
        }else
        printf("The result is %ld",c);
        break;
      case 1:
        d=a%b;
        printf("The result is %ld",d);
        break;
      default:
            printf("Wrong Input");
      }
getch();
}
