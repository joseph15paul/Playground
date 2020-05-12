#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int w,ad,ch;
  std::cin>>w>>ad>>ch;
  if(ad*75+ch*30<=w)
    std::cout<<"Boat is stable";
  else
    std::cout<<"Boat will drow";
    
}