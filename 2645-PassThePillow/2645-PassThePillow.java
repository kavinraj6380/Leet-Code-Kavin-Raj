// Last updated: 8/11/2026, 2:22:12 PM
class Solution {
    public int passThePillow(int n, int time) {
        int c=n-1;
        int t=time %(2 * c);
        if (t<=n-1){
            return 1+t;
        }
            else{ 
            return n-(t-(n-1));
        }
    }
}