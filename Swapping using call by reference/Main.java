#include<iostream>
int swap(int &a,int &b)
{
 a = a+b;
 b = a-b;
 a = a-b;
}
int main()
{
  int a,b;
  std::cin>>a>>b;
  std::cout<<"Before swapping a= "<<a<<" and b="<<b;
  swap(a,b);
  std::cout<<"\nAfter swapping a= "<<a<<" and b="<<b;
}