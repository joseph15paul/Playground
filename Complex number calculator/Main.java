#include<iostream>
struct cnum
{
  int a,b,c,d,x,y;
  void oper(int f)
  {
    if(f==1)
    {
      x = a + c;
      y = b + d;
    }	
    else if(f==2)
    {
      x = a - c;
      y = b - d;
    }	
    else if(f==3)
    {
      x = a*c - b*d;
      y = b*c + a*d;
    }	
    
  }
};
int main()
{
  cnum a;
  int f;
  std::cin>>f>>a.a>>a.b>>a.c>>a.d;
  if(f>3||f<1)
  {
    std::cout<<"Invalid choice";
    return 0;
    }
  a.oper(f);
  std::cout<<a.x;
  if(a.y<0)
      std::cout<<a.y<<"i";
  else 
      std::cout<<"+"<<a.y<<"i";
}

