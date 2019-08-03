#include <stdio.h>
int main()
{
 int base ,exponent;
  int result=1,i;
  scanf("%d %d",&base,&exponent);
    if(exponent>=0)
    {
      for(i=1;i<=exponent;i++)
    	{result=result*base;
        //  exponent-=1;
        }
     	 printf("%d",result);
    }	
     else{
      printf ("Wrong input");
    }
  //Your code here       
  //  return 0;
}