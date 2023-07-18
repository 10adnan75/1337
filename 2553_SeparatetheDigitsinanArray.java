// Runtime: 7 ms, Beats 48.50%
// Memory: 44.5 MB, Beats 29%
class Solution {
    public List<Integer> getDigits(String s) {
        List<Integer> l = new ArrayList<>();
        for (int i=0; i<s.length(); i++) {
            l.add(Character.getNumericValue(s.charAt(i)));
        }
        return l;
    }

    public int[] separateDigits(int[] nums) {
        List<Integer> l = new ArrayList<>();
        for (int i : nums) {
            l.addAll(getDigits(Integer.toString(i)));
        }
        int[] ans = new int[l.size()];
        for (int i=0; i<ans.length; i++) {
            ans[i] = l.get(i);
        }
        return ans;
    }
}

// Runtime: 1 ms, Beats 100%
// Memory: 43.8 MB, Beats 85.75%
class Solution {
    public int[] separateDigits(int[] nums) {
        int size = 0;
        for (int num : nums) {
            while (num != 0) {
                size++;
                num /= 10;
            }
        }
        int[] digits = new int[size];
        for (int i=nums.length-1; i>=0; i--) {
            while (nums[i] != 0) {
                digits[--size] = nums[i] % 10;
                nums[i] /= 10;
            }
        }
        return digits;
    }
}
