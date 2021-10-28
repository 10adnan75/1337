class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        if (arr.length != pattern.length()) {
            return false;
        }
        HashMap<Character, String> map = new HashMap<>();
        for (int i=0; i<pattern.length(); i++) {
            char c = pattern.charAt(i);
            if (map.containsKey(c)) {
                if (!map.get(c).equals(arr[i])) {
                    return false;
                } 
            } else if (map.containsValue(arr[i])) {
                return false;
            }
            map.put(c, arr[i]);   
        }
        return true;
    }
}
