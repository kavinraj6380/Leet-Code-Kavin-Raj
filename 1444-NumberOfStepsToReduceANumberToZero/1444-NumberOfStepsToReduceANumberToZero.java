// Last updated: 8/11/2026, 2:22:53 PM
class Solution {
    public int numberOfSteps(int num) {
      int c=0;
      while(num!=0){
        if(num%2==0){
        num=num/2;
        c++;
      }
      else{
      num=num-1;
      c++;
    }
      }
     return c;
     }
     }