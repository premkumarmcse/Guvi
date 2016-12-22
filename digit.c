#include<stdio.h>
#include<conio.h>
void main()
{

char ch;
printf("\nEnter the Character to check:\t");
scanf("%c",&ch);
{
if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
{
printf("The entered char %c is a vowel",ch);
}
if(isdigit(ch)>0)
    printf("The entered is digit");
if(isalpha(ch)>0)
    printf("the entered is char");
}

}



