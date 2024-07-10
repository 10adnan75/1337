class Solution {
    public int minOperations(String[] logs) {
        int c = 0;
        for (String log: logs) {
            if (log.equals("./")) {
                continue;
            }
            if (log.equals("../")) {
                c = c == 0 ? 0 : c - 1;
            } else {
                c++;
            }
        }
        return c;
    }
}
