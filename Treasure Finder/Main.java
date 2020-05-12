#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,d,sec;
  std::cin>>a>>b>>c;
  
  if((a<=b&&a>=c)||(a<=c&&a>=b))
  {
    sec=a;
    if(b<c)
      d=b;
     else
       d=c;
  }
  else if((b<=a&&b>=c)||(b<=c&&b>=a))
  {sec=b;
   if(a<c)
      d=a;
     else
       d=c;
  }
  else
    {sec=c;
   if(a<b)
      d=a;
     else
       d=b;
  }
    std::cout<<"The treasure is in box which has number "<<sec;
  if(a%d==0&&b%d==0&&c%d==0)
    d=d;
   else
     d=1;
    std::cout<<"\nThe code to open the box is "<<d;
  
}