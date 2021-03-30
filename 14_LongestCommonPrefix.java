class Solution {
    public String longestCommonPrefix(String[] strs) {
        String longest = new String();
        if(strs.length<=0) return longest;
        Arrays.sort(strs);
        for(int i=0; i<Math.min(strs[0].length(), strs[strs.length-1].length()); i++) {
            if (strs[0].charAt(i)!=strs[strs.length-1].charAt(i)) return longest;
            longest += strs[0].charAt(i);
        }
        return longest;
    }
}
