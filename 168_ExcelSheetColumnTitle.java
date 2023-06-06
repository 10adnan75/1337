class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0) {
            if (columnNumber % 26 == 0) {
                sb.append('Z');
                columnNumber--;
            } else {
                sb.append((char)(columnNumber % 26 + 64));
            }
            columnNumber /= 26;
        }
        return sb.reverse().toString();
    }
}
