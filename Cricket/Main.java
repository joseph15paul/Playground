#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int balls,runs,r,bo;
  float ov,rate,rt;
  int o;
  std::cin>>balls>>runs>>r>>bo;
  o=bo/6;
  ov=float(o+float(bo%6)/10);
  o=balls/6;
  rt=float(r/ov);
  rate=float(runs/float(o));
  std::printf("%d\n%0.1f\n%0.1f\n%0.1f",o,ov,rt,rate);
  if(rate>rt)
    std::cout<<"\nNot Eligible to Win";
  else
    std::cout<<"\nEligible to Win";
}