#include<stdio.h>
//#include<string.h>
int isvowel(char c)
{
  if(c=='a'||c=='i'||c=='o'||c=='e'||c=='u'||c=='A'
      ||c=='E'||c=='I'||c=='O'||c=='U')
  {
    return 0;
  }
    else
    {
    return 1;
}}
int main()
{
  char str[100],a[100],i;
  //int len=0,i=0,j=0;
  scanf("%[^\n]s",str);
 // len=strlen(str);
  for(i=0;str[i]!='\0';i++)
    if (isvowel(str[i]))
    
      printf("%c",str[i]);
    
  
    
 
  return 0;
}