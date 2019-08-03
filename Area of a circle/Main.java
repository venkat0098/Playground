#include<stdio.h>
int main()
{
  int diameter;
  float radius;
  
 float area;
  scanf("%d",&diameter);
  radius=(float) diameter/2;
  area=3.14*radius*radius;
  printf("%0.2f",area);
  return 0;
}