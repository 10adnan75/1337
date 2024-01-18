// 47/48 testcases passed (TLE for testcase #48)
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        for (int i=0; i<temperatures.length; i++) {
            int c = 0;
            for (int j=i+1; j<temperatures.length; j++) {
                if (j == temperatures.length - 1 && temperatures[j] <= temperatures[i]) {
                    c = 0;
                    break;
                }
                if (temperatures[j] > temperatures[i]) {
                    c++;
                    break;
                } else {
                    c++;
                }
            }
            ans[i] = c;
        }
        return ans;
    }
}

// Need new solution? - Stack!
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for (int i=0; i<temperatures.length; i++) {
            int curr = temperatures[i];
            while (!stack.isEmpty() && curr > temperatures[stack.peek()]) {
                int j = stack.pop();
                ans[j] = i - j;
            }
            stack.push(i);
        }
        return ans;
    }
}
