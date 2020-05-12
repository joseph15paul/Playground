#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,ne,sum=0;
  std::cin>>n;
  ne=n;
  while(n>0)
  {
    sum+=n%10;
    n/=10;
    
  }
  if(ne%sum==0)
    std::cout<<"Harshad Number";
  else
        std::cout<<"Not Harshad Number";

}