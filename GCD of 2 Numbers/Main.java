#include<iostream>
int gcd(int s,int a,int b)
{
  if(a%s==0 && b%s==0)
    return s;
  else
    gcd(s-1,a,b);
}
int main()
{
  //Type your code here.
  int a,b,s;
  std::cin>>a>>b;
  if(a<b)
    s=a;
  else
    s=b;
  std::cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<gcd(s,a,b);
}