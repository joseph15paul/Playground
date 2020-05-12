#include<iostream>
int main()
{
  // Type your code here
  int n;
  std::cin>>n;
  int m[n],small=0;
  for(int i=0;i<n;i++)
  {
    std::cin>>m[i];
    if(i == 0)
      small=m[i];
    else if(small<m[i])
      small=m[i];
  }
  std::cout<<small;
}