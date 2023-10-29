class Solution {
    public int bin2Dec(String num) {
        int ans = 0, p = 0;
        for (int i=num.length()-1; i>=0; i--) {
            ans += Math.pow(2, p++) * (int)(num.charAt(i)-'0');
        }
        return ans;
    }

    public String dec2Bin(int n) {
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            sb.append(n%2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    public int findComplement(int num) {
        String binary = dec2Bin(num);
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<binary.length(); i++) {
            if (binary.charAt(i) == '0') {
                sb.append(1);
            } else {
                sb.append(0);
            }
        }
        return bin2Dec(sb.toString());
    }
}
