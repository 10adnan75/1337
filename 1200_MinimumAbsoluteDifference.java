class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        int mAD = arr[1] - arr[0];
        for (int i=0; i<arr.length-1; i++) {
            if (arr[i+1]-arr[i] < mAD) {
                mAD = arr[i+1] - arr[i];
            }
        }
        for (int i=0; i<arr.length-1; i++) {
            if (arr[i+1]-arr[i] != mAD) {
                continue;
            }
            List<Integer> l = new ArrayList<>();
            l.add(arr[i]); l.add(arr[i+1]);
            ans.add(l);
        }
        return ans;
    }
}
