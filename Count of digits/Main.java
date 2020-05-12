#include<iostream>
int main()
{
  // Type your code here
  int n,c=0;
  std::cin>>n;
  if(n==0)
    n=1;
     while(n>0)
  {
    c++;
    n/=10;
  }
  std::cout<<c;
}