#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,sum=0;
  std::cin>>n;
  for(int i=n-1;i>0;i--)
  {
    sum+=i;
  }
  std::cout<<sum;
}