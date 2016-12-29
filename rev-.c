#include<stdio.h>
#include<conio.h>
int main()
{
char ch[10],b[10];
int i,l,t;
printf("Enter the string :");
scanf("%s",ch);
l=strlen(ch)-1;
t=l;
for(i=0;i<=l;i++)
{
b[t]=ch[i];
t--;
}
b[t]='\0';
for(i=0;i<=l;i++)
{
    if(ch[i]==ch[l])
{
 printf("%c",b[i]);
 break;
}
printf("%c-",b[i]);
}
return 0;
getch();
}
