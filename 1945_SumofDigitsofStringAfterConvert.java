// Jul 20, 2023
class Solution {
    public String getMoreLucky(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<s.length(); i++) {
            sb.append(s.charAt(i) - 'a' + 1);
        }
        return sb.toString();
    }
    
    public int makeLucky(int n) {
        int lucky = 0;
        while (n != 0) {
            lucky += n % 10;
            n /= 10;
        }
        return lucky;
    }

    public int getLucky(String s, int k) {
        String luckyString = getMoreLucky(s);
        int luckyNumber = 0;
        for (int i=0; i<luckyString.length(); i++) {
            luckyNumber += (int) luckyString.charAt(i) - '0';
        }
        while (--k > 0) {
            luckyNumber = makeLucky(luckyNumber);
        }
        return luckyNumber;
    }
}

// Sep 2, 2024
class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<s.length(); i++) {
            sb.append((int)(s.charAt(i))-96);
        }
        s = sb.toString();
        while (k-- > 0) {
            s = doTransform(s);
        }
        return Integer.valueOf(s);
    }

    public String doTransform(String s) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for (int i=0; i<s.length(); i++) {
            sum += s.charAt(i) - '0';
        }
        return sum + "";
    }
}
