#include<stdio.h>
#include<math.h>
#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  float a,b,c,d;
  cin>>a;
  cin>>b;
  c=(a*a)+(b*b);
  d=sqrt(c);
  cout<<setprecision(3)<<d;//Type your code here
  return 0;
}