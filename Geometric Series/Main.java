#include<stdio.h>
#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  //type your code here
  int i,n,j,kam,a=1;
  cin>>n;
  //cout<<"1";
 // for(i=1;i<n;i++){
  if(n%2==1){
    
    i=(n+1)/2;
   kam=a*pow(2,(i-1));
  cout<<kam;}
    else
    { 
      i=n/2;
      kam=a*pow(3,(i-1));
  cout<<kam;}
  
  return 0;
}