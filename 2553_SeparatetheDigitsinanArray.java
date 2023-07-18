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
