#include<iostream>
int dig(int n)
{
  int s=n;
  n/=10;
  if(n/10==0)
  return n+s%10;
  else 
    return s%10+dig(n);
}
int dsum(int n)
{
  int sum=0;
  sum=dig(n);
  if(sum/10==0)
    return sum;
  else
    dsum(sum);
  
}
int main()
{
  int n;
  std::cin>>n;
 std::cout<<dsum(n);
}