#include <stdio.h>
#include <ctype.h>
int main() {
	// Type your code here
  char ch;
  scanf("%c",&ch);
  if (islower(ch))
  printf("%c",toupper(ch));
  else
    printf("%c",tolower(ch));
	return 0;
}