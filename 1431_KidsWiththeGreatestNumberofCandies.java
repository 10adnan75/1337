class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int greatestNumber = 0;
        for (int candy : candies) {
            greatestNumber = Math.max(greatestNumber, candy);
        }
        List<Boolean> ans = new ArrayList<>();
        for (int candy : candies) {
            ans.add(extraCandies + candy >= greatestNumber);
        }
        return ans;
    }
}
