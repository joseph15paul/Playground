#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int p=0,r=0,t=0;
  float a,i,d;
  std::cin>>p>>r>>t;
  i=p*r*t/100;
  a=p+i;
  d=i*0.02;
  std::cout<<i<<"\n"<<a<<"\n"<<d<<"\n"<<a-d<<"\n";
}