#include<iostream>
using namespace std;
int pow(int a,int n)
{
  if(n==1)
    return a;
  else
  return pow(a,n-1)*a;
}
int main()
{
  int a,n;
  std::cout<<"Enter the value of a ";
  std::cin>>a; 
  std::cout<<"\nEnter the value of n ";
  std::cin>>n;
   std::cout<<"\nThe value of "<<a<<" power "<<n<<" is "<<pow(a,n);
  //Type your code here.
}