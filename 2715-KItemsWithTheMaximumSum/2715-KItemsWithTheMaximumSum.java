// Last updated: 8/11/2026, 2:22:09 PM
//JAVA
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        return Math.min(k, numOnes) - Math.max(0, k - numOnes - numZeros);
        
    }
}