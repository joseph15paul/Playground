#include<iostream>
int fact(int n)
{
  if(n==1)
    return 1;
  else
    return fact(n-1)*n;
}
int main()
{
  //Type your code here.
  int n;
  std::cin>>n;
  std::cout<<"The factorial of "<<n<<" is "<<fact(n);
}