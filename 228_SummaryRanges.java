// My solution
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        int i = 0;
        if (nums.length == 1) {
            ans.add(Integer.toString(nums[0]));
        }
        while (i < nums.length - 1) {
            if (nums[i] + 1 != nums[i+1]) {
                ans.add(Integer.toString(nums[i]));
                i++;
            } else {
                int k = i;
                int j = i + 1;
                while (j < nums.length && nums[j] == nums[k] + 1) {
                    k++;
                    j++;
                }
                // [i, k]
                ans.add(Integer.toString(nums[i]) + "->" + Integer.toString(nums[k]));
                i = j;
            }
            if (i == nums.length - 1) {
                ans.add(Integer.toString(nums[i]));
            }
        }
        return ans;
    }
}

// My memory-optimized solution
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            boolean f = false, flag = false;
            String s = String.valueOf(nums[i]) + "";
            while (i != nums.length - 1 && nums[i] == nums[i+1] - 1) {
                f = true;
                i++;
            }
            if (f) {
                s += "->" + String.valueOf(nums[i++]);
            } else { 
                i++;
            }
            ans.add(s);
        }
        return ans;
    }
}

// Editorial
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        for (int i=0; i<nums.length; i++) {
            int curr = nums[i];
            while (i < nums.length - 1 && nums[i] + 1 == nums[i+1]) {
                i++;
            }
            if (curr == nums[i]) {
                ans.add(String.valueOf(curr));
            } else {
                ans.add(curr + "->" + nums[i]);
            }
        }
        return ans;
    }
}
