#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float ml;
  int fu,d;
  std::cin>>ml>>fu>>d;
  if(ml*fu<=d)
    std::cout<<"Cannot reach";
  else
        std::cout<<"Can reach";

}