#include <stdio.h>
int main()
{
    int a[50],b,c;
    printf("Enter the elements:");
    scanf("%d",&a);
    b=strrev(a);
    if(strcmp(a,b)==0)
    {
        printf("Palindrome");
    }else
    printf("Not a palindrome");
getch();
return 0;
}
