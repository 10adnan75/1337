class Solution {
    
    public int[] intersect(int[] nums1, int[] nums2) {
        
        // HashMap O(n+m) - Runtime: 5 ms, Memory: 41.4 MB (Linear)
        /* if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums1) {
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        int idx = 0;
        for (int i : nums2) {
            if (map.getOrDefault(i, 0) > 0) {
                nums1[idx++] = i;
                map.put(i, map.get(i)-1);
            }
        }
        int[] ans = new int[idx];
        for (int i=0; i<idx; i++) {
            ans[i] = nums1[i];
        }
        return ans; */
        
        // Two Pointers O(lgn+lgm) - Runtime: 2 ms, Memory: 39.2 MB (Logarithmic)
        Arrays.sort(nums1); Arrays.sort(nums2);
        int i=0, j=0, k=0;
        while (i<nums1.length && j<nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums2[j] < nums1[i]) {
                j++;
            } else {
                nums1[k++] = nums1[i];
                ++i; ++j;
            }
        }
        int[] ans = new int[k];
        for (i=0; i<k; i++) {
            ans[i] = nums1[i];
        }
        return ans;
    }
}
