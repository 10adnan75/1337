// Brute force: TLE :(
class Solution {
    public int numSteps(String s) {
        int c = 0, bin = getBinary(s);
        while (bin != 1) {
            if ((bin&1) == 1) {
                bin++;
            } else {
                bin /= 2;
            }
            c++;
        }
        return c;
    }

    public int getBinary(String s) {
        int p = 0, bin = 0;
        for (int i=s.length()-1; i>=0; i--) {
            bin += Math.pow(2, p++) * Integer.valueOf(s.charAt(i)-'0');
        }
        return bin;
    }
}

// Accepted :)
class Solution {
    public int numSteps(String s) {
        int c = 0, carry = 0;
        for (int i=s.length()-1; i>0; i--) {
            int digit = s.charAt(i)-'0' + carry;
            if ((digit&1) == 1) {
                c += 2;
                carry = 1;
            } else {
                c++;
            }
        }
        return c + carry;
    }
}
