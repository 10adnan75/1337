class Solution {
    public int getMinutes(String time) {
        return Integer.parseInt(time.substring(0, 2)) * 60 + Integer.parseInt(time.substring(3, 5));
    }

    public int helper(int n) {
        int c = 0;
        while (n != 0) {
            if (n - 60 >= 0) {
                n -= 60;
            } else if (n - 15 >= 0) {
                n -= 15;
            } else if (n - 5 >= 0) {
                n -= 5;
            } else {
                n -= 1;
            }
            c++;
        }
        return c;
    }

    public int convertTime(String current, String correct) {
        int currMin = getMinutes(current), corrMin = getMinutes(correct);
        int diff = Math.abs(currMin - corrMin);
        return helper(diff);
    }
}
