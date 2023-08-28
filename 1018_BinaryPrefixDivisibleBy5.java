// Need to work on this!
class Solution {
    public long M = 1000000007;

    public long binaryToDecimal(String n) {
        long ans = 0;
        long p = 0;
        for (int i=n.length()-1; i>=0; i--) {
            ans += ((Math.pow(2, p++) * (n.charAt(i)-'0')) % M);
        }
        return ans;
    }

    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ans = new ArrayList<>();
        String sum = "";
        for (int num : nums) {
            sum += num;
            if (binaryToDecimal(sum) % 5 == 0) {
                ans.add(true);
            } else {
                ans.add(false);
            }
        }
        return ans;
    }
}

// Accepted solution
class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ans = new ArrayList<>();
        int i = 0;
        for (int num : nums) {
            i = (i * 2 + num) % 5;
            ans.add(i == 0);
        }
        return ans;
    }
}
