class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total = numBottles;
        while (numBottles != 0) {
            int drinkable = numBottles / numExchange, empty = numBottles % numExchange;
            numBottles = drinkable + empty;
            if (numBottles < numExchange) {
                numBottles = 0;
            }
            total += drinkable;
        }
        return total;
    }
}
