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

// Aug 21, 2024
class Solution {
    public int findComplement(int num) {
        return b2i(i2b(num));
    }

    public int b2i(String binary) {
        int integer = 0, p = 0;
        for (int i=binary.length()-1; i>=0; i--) {
            integer += (Math.pow(2, p++) * (int)(binary.charAt(i)-'0'));
        }
        return integer;
    }

    public String i2b(int integer) {
        StringBuilder binary = new StringBuilder();
        while (integer != 0) {
            int mod = integer % 2 == 0 ? 1 : 0;
            binary.append(mod);
            integer /= 2;
        }
        return binary.reverse().toString();
    }
}
