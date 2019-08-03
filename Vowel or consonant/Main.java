#include<stdio.h>
int main()
{
  //type your code here
  
  char c;
  int i,j;
  scanf("%c",&c);
  i=(c=='a'||c=='e'||c=='i'||c=='o'||c=='u');
  j=(c=='A'||c=='E'||c=='I'||c=='O'||c=='U');
  if(i||j)
  {  printf("Vowel");}
  else
  {printf("Consonant");}
  return 0;
}