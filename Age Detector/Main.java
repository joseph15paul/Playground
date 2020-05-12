#include<iostream>
using namespace std;
int main()
{
  //Type your code here.

  int bd,yr;
  std::cin>>bd>>yr;
  if(bd>yr)
    std::cout<<(100-bd)+yr;
  else if(bd<yr)
    std::cout<<yr-bd;
}
     