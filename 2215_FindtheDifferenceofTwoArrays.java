class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(getDistinct(nums2, nums1));
        ans.add(getDistinct(nums1, nums2));
        return ans;
    }

    public List<Integer> getDistinct(int[] nums1, int[] nums2) {
        List<Integer> l = new ArrayList<>();
        boolean[] count = new boolean[2001];
        for (int i : nums1) {
            count[i + 1000] = true;
        }
        for (int i : nums2) {
            if (!count[i + 1000]) {
                l.add(i);
                count[i + 1000] = true;
            }
        }
        return l;
    }
}

// My solution
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(getDistinct(nums1, nums2));
        ans.add(getDistinct(nums2, nums1));
        return ans;
    }

    public List<Integer> getDistinct(int[] nums1, int[] nums2) {
        List<Integer> l = new ArrayList<>();
        for (int i=0; i<nums1.length; i++) {
            boolean count = true;
            for (int j=0; j<nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    count = false;
                    break;
                }
            }
            if (count && !l.contains(nums1[i])) {
                l.add(nums1[i]);
            }
        }
        return l;
    }
}
