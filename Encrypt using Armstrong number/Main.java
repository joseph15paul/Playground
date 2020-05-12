#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
    //Your code goes here
  int a,dig=0,t=n;
  for(int i=n;i>0;i=i/10)
    dig++;
  for(int i=0;i<dig;i++)
  {  a+=power(n%10,dig);
     n/=10;
  }
  if(a==t)
    return 1;
  else
    return 0;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}