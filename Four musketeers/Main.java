#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x1=0,x2=0,x3=0,y1=0,y2=0,y3=0;
  float x=0.0,y=0.0;
  std::cin>>x1>>y1>>x2>>y2>>x3>>y3;
  x=(float)(x1+x2+x3)/3;
  y=(float)(y1+y2+y3)/3;
  std::cout<<x<<"\n"<<y;
}