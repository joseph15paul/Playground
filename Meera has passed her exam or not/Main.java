#include<iostream>
int main()
{
  // Type your code here
  int n,o,f=1;
  std::cin>>n;
  int r[n];
  for(int i=0;i<n;i++)
  {
    std::cin>>r[i];
  }
  std::cin>>o;
  for(int i=0;i<n;i++)
  {
    if(r[i]==o)
    {
      f=-1;
          std::cout<<"She passed her exam";
    }
   }
  if(f==1)
    std::cout<<"She failed";

}