#include"stdio.h"
main()
{
float area1,area2;
int l,b,h,r,area3;
printf("Enter the length:");
scanf("%d",&l);
printf("Enter the breadth:");
scanf("%d",&b);
printf("Enter the height:");
scanf("%d",&h);
printf("Enter the radius:");
scanf("%d",&r);
area1=circle(r);
area2=triangle(b,h);
area3=rectangle(l,b);

printf("\nThe area of circle is %f",area1);
printf("\nThe area of triangle is %f",area2);
printf("\nThe area of rectangle is %d",area3);
}
int circle(r)
{
int cir;
cir=3.14*r*r;
return cir;
}
int triangle(b,h)
{
float tri;
tri=0.5*b*h;
return tri;
}
int rectangle(l,b)
{
int rec;
rec=l*b;
return rec;
}
