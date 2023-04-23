class Solution {
    public int findLucky(int[] arr) {
        int[] frequency = new int[501];
        for (int i : arr) {
            frequency[i]++;
        }
        for (int i=frequency.length-1; i>0; i--) {
            if (i == frequency[i]) {
                return i;
            }
        }
        return -1;
    }
}

// Improved performance 
class Solution {
    public int findLucky(int[] arr) {
        int[] frequency = new int[501];
        int start = Integer.MIN_VALUE;
        for (int i : arr) {
            frequency[i]++;
            start = Math.max(start, i);
        }
        for (int i=start; i>0; i--) {
            // System.out.println("frequency[" + i + "]: " + frequency[i]);
            if (i == frequency[i]) {
                return i;
            }
        }
        return -1;
    }
}
