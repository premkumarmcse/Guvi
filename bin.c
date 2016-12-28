#include<stdio.h>
#include<conio.h>
int con(int);
main()
{
int dec,bin;
printf("Enter the value for dec");
scanf("%d",&dec);
bin=con(dec);
printf("The bin value of dec %d=%d",dec,bin);
getch();
}
int con(int dec)
{
if(dec==0)
{
return 0;
}
else
return (dec%2+10*(con(dec/2)));
}
