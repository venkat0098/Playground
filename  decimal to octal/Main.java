#include<stdio.h>
int main()
{
  int a[100],i,j,n;
  scanf("%d",&n);
  for(i=0;n>0;i++)
  {
  a[i]=n%8;
  n=n/8;
  }
  for(j=i-1;j>=0;j--)
  {
  printf("%d",a[j]);}
  return 0;
}