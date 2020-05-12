#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float t;
  int it;
  std::cin>>it>>t;
  if(it==1)
  printf("%0.2f",t);
  else  if(it==2)
  printf("%0.2f",t*1.5);
  else  if(it==3)
  printf("%0.2f",t*2);
  else  
  printf("Number of items is more");
}