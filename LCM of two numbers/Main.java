#include<stdio.h>
int main()
{
  int a,b,i,gcd,lcm,d;
  scanf("%d%d",&a,&b);
  for(i=1;i<=a&&i<=b;i++)
  {
  if(a%i==0 && b%i==0)
  gcd=i;
  }
  d=(a*b);
  lcm=d/gcd;
  printf("%d",lcm);
  return 0;
}