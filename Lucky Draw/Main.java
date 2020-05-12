#include<iostream>
bool isPrime(int n)
{
  if(n==0||n==1||n<0)
    n=4;
  int i=n/2;
 while(i>1)
 {
   if(n%i==0)
   {
     return false;
     break;
   }
   i--;
  }
  return true;
}
int main()
{
  int n;
  std::cin>>n;
  if(isPrime(n))
    std::cout<<"Eligible";
  else
    std::cout<<"Not eligible";
}