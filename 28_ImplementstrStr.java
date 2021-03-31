class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.equals(haystack)) return 0;
        for(int i=0; i<haystack.length()-needle.length()+1; i++) {
            int index = i, j = 0; 
            while(j < needle.length()) {
                if(haystack.charAt(index)==needle.charAt(j)) {
                    j++;
                    index++;
                } else break;
            }
            if(j == needle.length()) return i;
        }
        return -1;
    }
}
