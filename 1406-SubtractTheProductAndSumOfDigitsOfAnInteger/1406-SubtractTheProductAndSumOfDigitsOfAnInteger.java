// Last updated: 8/11/2026, 2:22:55 PM
class Solution {
    public int subtractProductAndSum(int n) {
        int s=0;
        int p=1;
        int d;
        int r;
        while (n>0)
        {
        d=n%10;
        s+=d;
        p*=d;
        n/=10;
        }
        r=p-s;
        return r;
        
    }
     
}