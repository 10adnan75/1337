class Solution {
    public int getSOD(int n) {
        String num = n + "";
        int c = 0;
        for (int i=0; i<num.length(); i++) {
            c += (int)num.charAt(i)-'0';
        }
        return c;
    }

    public int countBalls(int lowLimit, int highLimit) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int i=lowLimit; i<=highLimit; i++) {
            int sod = getSOD(i);
            map.put(sod, map.getOrDefault(sod, 0)+1);
            max = Math.max(max, map.get(sod));
        }
        return max;
    }
}
