#include<iostream>
int main()
{
  int a=0,b=0;
  std::cin>>a>>b;
  if(a>b)
    std::cout<<b<<" is smallest number";   
  else
    std::cout<<a<<" is smallest number";
}