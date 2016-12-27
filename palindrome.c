#include<stdio.h>
#include<string.h>
int main()
{
    int a,b,c,temp=0;
    printf("Enter the elements:");
    scanf("%d",&a);
    c=a;
    while(a!=0)
    {
    b=a%10;
    temp=temp*10+b;
    a=a/10;
    }
    if(c==temp)
    {
    printf("Palindrome");
    }else
    {
    printf("Not a palindrome");
    }
getch();
return 0;
}
