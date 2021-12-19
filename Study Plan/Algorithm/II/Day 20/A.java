class Solution {
    private int[] data = null;
    private Random random;
    
    public Solution(int[] nums) {
        data = nums;
        random = new Random();
    }
    
    public int[] reset() {
        return data;
    }
    
    public int[] shuffle() {
        /*
        int i=0;
        int[] copy = new int[data.length];
        while (i < data.length) {
            copy[i++] = data[data.length-i];
        }
        */
        if (data == null) {
            return null;
        }
        int[] copy = data.clone();
        for (int i=1; i<copy.length; i++) {
            int rand = random.nextInt(i+1);
            int temp = copy[rand]; copy[rand] = copy[i]; copy[i] = temp;
        }
        return copy;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
