// Last updated: 8/11/2026, 2:23:01 PM
class Solution {
    public int recursion(int n, int[] dp){
       
        if(n==0) return 0;
        if(n==1 || n==2) return 1;

        if(dp[n]!=-1){ 
            return dp[n]; 
        }

        dp[n] = recursion(n-3, dp) + recursion(n-2, dp) + recursion(n-1, dp); 
        return dp[n];
    }
    public int tribonacci(int n) {
        
        int[] dp = new int[n+1]; 
        Arrays.fill(dp, -1); 
        return recursion(n, dp);
    }
}