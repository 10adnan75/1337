class Solution {
    public List<String> cellsInRange(String s) {
        List<String> ans = new ArrayList<>();
        for (int j=s.charAt(0); j<=s.charAt(3); j++) {   
            for (int i=s.charAt(1)-'0'; i<=s.charAt(4)-'0'; i++) {
                ans.add((char)j + "" + i);
            }
        }
        return ans;
    }
}
