// Using a stack: 1 ms
class Solution {
    public List<String> buildArray(int[] target, int n) {
        Stack<Integer> s = new Stack<>();
        List<String> ans = new ArrayList<>();
        int idx = 0;
        for (int i=1; i<=n && idx<target.length; i++) {
            s.push(i);
            ans.add("Push");
            if (i == target[idx]) {
                idx++;
            } else {
                ans.add("Pop");
                s.pop();
            }
        }
        return ans;
    }
}

// Without stack: 0 ms
class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();
        int idx = 0;
        for (int i=1; i<=n && idx<target.length; i++) {
            ans.add("Push");
            if (i == target[idx]) {
                idx++;
            } else {
                ans.add("Pop");
            }
        }
        return ans;
    }
}
