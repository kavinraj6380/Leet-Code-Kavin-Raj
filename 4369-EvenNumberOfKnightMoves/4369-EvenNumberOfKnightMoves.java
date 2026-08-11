// Last updated: 8/11/2026, 2:21:42 PM
class Solution {
   public boolean canReach(int[] start, int[] target) {
    return (start[0] + start[1] + target[0] + target[1]) % 2 == 0;
}
}