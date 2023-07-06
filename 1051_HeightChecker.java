// Sorting, 1 ms
class Solution {
    public int heightChecker(int[] heights) {
        int[] expected = new int[heights.length];
        System.arraycopy(heights, 0, expected, 0, heights.length);
        Arrays.sort(heights);
        int count = 0;
        for (int i=0; i<heights.length; i++) {
            if (heights[i] != expected[i]) {
                count++;
            }
        }
        return count;
    }
}

// Using frequency array, 0 ms
class Solution {
    public int heightChecker(int[] heights) {
        int[] freq = new int[101];
        int count = 0, idx = 0;
        for (int i : heights) {
            freq[i]++;
        }
        for (int i=0; i<freq.length; i++) {
            while (freq[i]-- > 0) {
                if (heights[idx++] != i) {
                    count++;
                }
            }
        }
        return count;
    }
}
