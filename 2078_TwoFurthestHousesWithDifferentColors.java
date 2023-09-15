class Solution {
    public int maxDistance(int[] colors) {
        int distance = 0;
        for (int i=0; i<colors.length; i++) {
            for (int j=i+1; j<colors.length; j++) {
                if (colors[i]!=colors[j] && Math.abs(i-j)>distance) {
                    distance = Math.abs(i-j);
                }
            }
        }
        return distance;
    }
}
