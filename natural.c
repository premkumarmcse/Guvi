#include<stdio.h>
#include<conio.h>
int main()
{
  int i,num,sum=0;
  printf("\nEnter any Integer Value\n");
  scanf("%d",&num);
  for(i=1;i<=num;i++)
  {
     sum=sum+i;
  }
  printf("Sum of N Numbers=%d",sum);
  return 0;
  getch();
}
