// Last updated: 8/11/2026, 2:22:24 PM
class Solution {
    public int commonFactors(int a, int b) {
    int c=0;
    int a1;
    if(a<b) 
    a1=b;
    else
    a1=a;
    for(int i=1;i<=a1;i++){
    if(a%i==0 && b% i==0)
    c++;
    }
      return c;
    }
   
}
