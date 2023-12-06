class Solution {
    public String flip(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == '1') {
                sb.append(0);
            } else {
                sb.append(1);
            }
        }
        return sb.toString();
    }

    public int bin2Dec(String n) {
        int decimal = 0, p = 0;
        for (int i=n.length()-1; i>=0; i--) {
            int s = n.charAt(i)-'0';
            decimal += s * Math.pow(2, p++);
        }   
        return decimal;
    }

    public String dec2Bin(int n) {
        if (n == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            sb.append(n%2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    public int bitwiseComplement(int n) {
        return bin2Dec(flip(dec2Bin(n)));
    }
}

// class Solution {
//     public String flip(String s) {
//         StringBuilder sb = new StringBuilder();
//         for (int i=0; i<s.length(); i++) {
//             if (s.charAt(i) == '1') {
//                 sb.append(0);
//             } else {
//                 sb.append(1);
//             }
//         }
//         return sb.toString();
//     }

//     public int bin2Dec(String s) {
//         int n = Integer.parseInt(s), p = 0, decimal = 0;
//         while (n != 0) {
//             decimal += Math.pow(2, p++) * (n%10);
//             n /= 10;
//         }
//         return decimal;
//     }

//     public String dec2Bin(int n) {
//         if (n == 0) {
//             return "0";
//         }
//         StringBuilder sb = new StringBuilder();
//         while (n != 0) {
//             sb.append(n%2);
//             n /= 2;
//         }
//         return sb.reverse().toString();
//     }

//     public int bitwiseComplement(int n) {
//         return bin2Dec(flip(dec2Bin(n)));
//     }
// }
