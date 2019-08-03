#include<stdio.h>
int main()
{
 int a,t1=0,t2=1,nextterm=0,n;
  scanf("%d",&a);
  // printf("%d %d ", t1, t2);
 //	nextterm=t1+t2;
  for(int i=1;i<=a;++i){
    printf("%d ",t1);
    nextterm=t1+t2;
 	 t1=t2;
	 t2=nextterm;
      
  }
  
  return 0;
}