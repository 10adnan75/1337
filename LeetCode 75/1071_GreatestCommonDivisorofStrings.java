class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String smallString = "";
        String bigString = "";

        if (str1.length() < str2.length()) {
            smallString = str1;
            bigString = str2;
        } else {
            smallString = str2;
            bigString = str1;
        }

        for (int i = smallString.length()-1; i >= 0; i--) {
            String str = smallString.substring(0, i + 1);
            if (checkIfDivides(smallString, str) && checkIfDivides(bigString, str)) {
                return str;
            }
        }

        return "";
    }

    public boolean checkIfDivides(String str, String divider) {
        int length = str.length() / divider.length();
        int start = 0, end = divider.length(), plus = divider.length();

        if (str.length() % divider.length() != 0) {
            return false;
        }

        while (length-- > 0) {
            if (!str.substring(start, end).equals(divider)) {
                return false;
            }
            start += plus;
            end += plus;
        }

        return true;
    }
}