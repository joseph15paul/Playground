#include<iostream>
int main()
{
  int a,b,c,small,d,ans;
  std::cin>>a>>b>>c>>ans;
  if(a<b&&a<c)
    small=a;
  else  if(a>b&&b<c)
    small=b; 
  else
    small=c;
  while(small>0)
  { if(a%small==0 && b%small==0 && c%small==0)
       break;
      small--;
  }
  if(small==ans)
    std::cout<<"Answer is correct.";
  else
        std::cout<<"Answer is wrong.";
}