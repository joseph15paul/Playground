#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r;
  string s;
  std::cin>>s>>r;
  if(s=="front")
  { if(r==1)
      std::cout<<"Left Handed";
    else
      std::cout<<"Right Handed";}
  else if(s=="rear") 
  {  if(r==1)
      std::cout<<"Right Handed";
    else
      std::cout<<"Left Handed";}

  }