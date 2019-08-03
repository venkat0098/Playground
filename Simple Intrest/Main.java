#include<stdio.h>
int main()
{
  //your code here
 float principle,years;
  float interest,result;
  scanf("%f",&principle);
  scanf("%f",&years);
  
  scanf("%f",&interest);
  result=(principle*years*interest)/100;
  //result/=100;
  printf("%f",result);
  return 0;
}