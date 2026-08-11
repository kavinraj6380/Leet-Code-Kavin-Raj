// Last updated: 8/11/2026, 2:22:30 PM
class Solution {

    public boolean isSameAfterReversals(int num) {

        if(num == 0)
        {
            return true;
        }

        return num % 10 != 0;
    }
}