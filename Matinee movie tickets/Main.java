#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int age;
  float t,m=13.3;
  std::cin>>age>>t;
 
  if(t==m)
  {if(age<=13)
      std::cout<<"$2.00";
    else
       std::cout<<"$5.00";
  }
   else
   { if(age<=13)
      std::cout<<"$4.00";
    else
       std::cout<<"$8.00";}
}