// Last updated: 8/11/2026, 2:21:40 PM
class Solution {
    public int largestInteger(int n, int s) {
        // If the required sum is greater than the maximum possible sum for n digits
        if (s > 9 * n) {
            return -1;
        }
        
        int result = 0;
        
        // Greedily build the number from left to right
        for (int i = 0; i < n; i++) {
            int digit = Math.min(9, s);
            result = result * 10 + digit;
            s -= digit;
        }
        
        return result;
    }
}