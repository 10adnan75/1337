import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = getMax(candies);
        List<Boolean> result = new ArrayList<>();

        for (int candy : candies) {
            if (candy + extraCandies >= max) {
                result.add(true);
            }
            else {
                result.add(false);
            }
        }

        return result;
    }

    public int getMax(int[] candies) {
        int max = Integer.MIN_VALUE;

        for (int candy : candies) {
            max = Math.max(max, candy);
        }

        return max;
    }
}