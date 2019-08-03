#include<stdio.h>
int main()
{
  int a[100],n,i,j,k;
  scanf("%d",&n);
  
  for(i=0;i<n;i++)
  
    scanf("%d",&a[i]);
    scanf("%d",&k);
    //Type your code here
  for(i=0;i<n;i++){
	  if(a[i]==k){
   printf("%d",i+1);
  break;}}
    if(i==n)
    {printf("%d isn't present in the array.",k);
    }
  
  return 0;
  
}