#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int u,p;
  std::cin>>u;
  if(u<=200)
    p=u*0.5;
  else if(u<=400)
    p=u*0.65+100;
  else if(u<=600)
    p=u*0.8+200;
  else
    p=u*1.25+425;
  std::cout<<"Rs."<<p;
}