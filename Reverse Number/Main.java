#include <iostream>
#include<math.h>
int main() 
{
	// Type your code here
  int n,p=10,ne=0,d=0,r=100,i=0;
  std::cin>>n;
  r=n;
  while(r>=10)
  { 
    r=r/10;
    i+=1;
  }
  d=pow(10,i);
  while(n>0)
  {
    ne+=(n%p)*(d);
    n/=10;
    d/=10;
    
  }
  std::cout<<ne;
  
	return 0;
}