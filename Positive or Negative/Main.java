#include<iostream>
int main()
{
  int a=0;
  std::cin>>a;
  if(a<0)
    std::cout<<a<<" is a negative number.";
  else
  std::cout<<a<<" is a positive number.";
}