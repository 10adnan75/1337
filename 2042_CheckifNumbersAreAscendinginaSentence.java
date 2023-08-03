class Solution {
    public boolean areNumbersAscending(String s) {
        ArrayList<Integer> list = new ArrayList<>();
        for (String ss : s.split(" ")) {
            if (ss.charAt(0) - '0' >= 0 && ss.charAt(0) - '0' <= 9) {
                list.add(Integer.valueOf(ss));
            }
        }
        for (int i=1; i<list.size(); i++) {
            if (list.get(i) <= list.get(i-1)) {
                return false;
            }
        }
        return true;
    }
}
