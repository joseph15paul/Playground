#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  //Type your code here.
  int x=0,y=0,h=0;
  std::cin>>x>>y;
  h = pow(pow((x-3),2)+pow((y-4),2),0.5);
  std::cout<<h;
}