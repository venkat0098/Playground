#include<stdio.h>
//#include<conio.h>
int main()
{
float radius,angle,result;
scanf("%f %F",&radius,&angle);
result=(2*3.14*radius*angle)/360;
  
  printf("%.2f",result);
}