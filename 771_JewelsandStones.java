class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Boolean> map = new HashMap<>();
        for (char c : jewels.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, true);
            }
        }
        int count = 0;
        for (char c : stones.toCharArray()) {
            if (map.get(c) != null) {
                count++;
            }
        }
        return count;
    }
}
