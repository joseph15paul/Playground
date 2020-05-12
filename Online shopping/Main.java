#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int fam,fd,fsh,sam,sd,ssh,aam,ad,ash,f,s,a;
  std::cin>>fam>>fd>>fsh>>sam>>sd>>ssh>>aam>>ad>>ash;
  f=fam-(fam*fd)/100+fsh;
 s=sam-(sam*sd)/100+ssh;
  a=aam-(aam*ad)/100+ash;
  std::cout<<"In Flipkart Rs."<<f<<"\nIn Snapdeal Rs."<<s<<"\nIn Amazon Rs."<<a<<"\n";
  if(f<=s&&f<=a)
    std::cout<<"He will prefer Flipkart";
  else if(s<=a)
    std::cout<<"He will prefer Snapdeal";
  else 
    std::cout<<"He will prefer Amazon";
}