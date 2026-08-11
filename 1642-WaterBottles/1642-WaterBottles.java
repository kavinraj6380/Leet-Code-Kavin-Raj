// Last updated: 8/11/2026, 2:22:43 PM
class Solution {

    public int numWaterBottles(int numBottles, int numExchange) {
        int consumedBottles = 0;

        while (numBottles >= numExchange) {
           
            consumedBottles += numExchange;
            numBottles -= numExchange;

           
            numBottles++;
        }


        return consumedBottles + numBottles;
    }
}