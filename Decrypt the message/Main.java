#include<iostream>
int main()
{
  int n,t,r,i=1;
  std::cin>>n>>t;
  r=n+t;
  n=0;
  while(i<=r/2)
  {
    if(r%i==0)
      n+=i;
    i++;
  }
  if(r==n)
    std::cout<<"They can read the message";
  else
    std::cout<<"They can't read the message";
}