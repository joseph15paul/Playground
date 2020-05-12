#include<iostream>
int main()
{
  int n,i=1,b,l,cnt=0;
  std::cin>>b>>l;
  if(b==0)
    b=1;
  n=0;
  for(int j=b;j<=l;j++)
  {n=0;i=1;
    while(i<=j/2)
  {
    if(j%i==0)
      n+=i;
    i++;
  }
  if(j==n)
std::cout<<j<<" ";
  }
  
}