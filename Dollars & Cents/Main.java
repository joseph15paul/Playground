#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int d,dd,c,cc,dol,cent;
  std::cin>>d>>c>>dd>>cc;
  dol=d+dd;
  cent=c+cc;
  if(cent>=100)
  {
    dol++;
    cent-=100;
  }
  std::cout<<dol<<"\n"<<cent;
}