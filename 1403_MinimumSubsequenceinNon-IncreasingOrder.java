// Sorting
class Solution {
    public int getSum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int sum = getSum(nums);
        Arrays.sort(nums);
        int temp = 0;
        for (int i=nums.length-1; i>=0; i--) {
            ans.add(nums[i]);
            temp += nums[i];
            if (temp > sum - temp) {
                return ans;
            }
        }
        return ans;
    }
}

// Frequency array without sort
class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        int[] freq = new int[101];
        int sum = 0;
        for (int num : nums) {
            freq[num]++;
            sum += num;
        }
        List<Integer> ans = new ArrayList<>();
        int temp = 0;
        for (int i=freq.length-1; i>=0; i--) {
            while (freq[i]-- > 0 && temp <= sum - temp) {
                temp += i;
                ans.add(i);
            }
        }
        return ans;
    }
}
