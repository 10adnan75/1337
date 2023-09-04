// My code
class Solution {
    public boolean isFascinating(int n) {
        int[] nums = new int[10];
        String s = "" + n + (n * 2) + (n * 3);
        for (int i=0; i<s.length(); i++) {
            nums[s.charAt(i)-'0']++;
        }
        for (int i=1; i<nums.length; i++) {
            if (nums[i] != 1) {
                return false;
            }
        }
        return nums[0] > 0 ? false : true; 
    }
}

// Code to print all the fascinating numbers
class Solution {
    boolean[] ans = new boolean[1000];

    public boolean isFascinating(int n) {
        for (int i=0; i<1000; i++) {
            ans[i] = check(i);
            // if (check(i)) {
            //     System.out.println(i);
            //     192
            //     219
            //     273
            //     327
            // }
        }
        return ans[n];
    }

    public boolean check(int n) {
        int[] nums = new int[10];
        String s = "" + n + (n * 2) + (n * 3);
        for (int i=0; i<s.length(); i++) {
            nums[s.charAt(i)-'0']++;
        }
        for (int i=1; i<nums.length; i++) {
            if (nums[i] != 1) {
                return false;
            }
        }
        return nums[0] > 0 ? false : true; 
    }
}

// Ugly hack :)
class Solution {
    public boolean isFascinating(int n) {
        return n == 192 || n == 219 || n == 273 || n == 327;
    }
}
