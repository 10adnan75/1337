// Extra space using an ArrayList<>()
class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int[] freq = new int[1001];
        for (int[] num : nums1) {
            freq[num[0]] += num[1];
        }
        for (int[] num : nums2) {
            freq[num[0]] += num[1];
        }
        List<List<Integer>> mat = new ArrayList<>();
        for (int i=1; i<freq.length; i++) {
            List<Integer> l = new ArrayList<>();
            if (freq[i] != 0) {
                l.add(i);
                l.add(freq[i]);
                mat.add(l);
            }
        }
        int[][] ans = new int[mat.size()][2];
        int i = 0;
        for (List<Integer> l : mat) {
            ans[i][0] = l.get(0);
            ans[i][1] = l.get(1);
            i++;
        }
        return ans;
    }
}

// Optimal space 
class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int[] freq = new int[1001];
        for (int[] num : nums1) {
            freq[num[0]] += num[1];
        }
        for (int[] num : nums2) {
            freq[num[0]] += num[1];
        }
        int idx = 0;
        for (int i=1; i<freq.length; i++) {
            if (freq[i] != 0) {
                idx++;
            }
        }
        int[][] ans = new int[idx][2];
        idx = 0;
        for (int i=1; i<freq.length; i++) {
            if (freq[i] != 0) {
                ans[idx][0] = i;
                ans[idx][1] += freq[i];
                idx++;
            }
        }
        return ans;
    }
}

// Alternate approach
class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<int[]> list = new ArrayList<>();
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i][0] == nums2[j][0]) {
                nums1[i][1] += nums2[j][1];
                list.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i][0] < nums2[j][0]) {
                list.add(nums1[i++]);
            } else {
                list.add(nums2[j++]);
            }
        }
        while (i < nums1.length) {
            list.add(nums1[i++]);
        }
        while (j < nums2.length) {
            list.add(nums2[j++]);
        }
        return list.toArray(new int[list.size()][2]);
    }
}
