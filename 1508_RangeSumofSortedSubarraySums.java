class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int[] aux = new int[n*(n+1)/2];
        int id = 0;
        for (int i=0; i<n; i++) {
            int sum = 0;
            for (int j=i; j<n; j++) {
                sum += nums[j];
                aux[id++] = sum;
            }
        }
        id = 0;
        Arrays.sort(aux);
        for (int i=left-1; i<right; i++) {
            id = (id + aux[i]) % 1000000007;
        }
        return id;
    }
}
