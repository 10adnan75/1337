// My solution
class Solution {
    public int bestClosingTime(String customers) {
        int size = customers.length();
        int[] countN = new int[size+1];
        int[] countY = new int[size+1];
        for (int i=1; i<=size; i++) {
            countN[i] = countN[i-1];
            if (customers.charAt(i-1) == 'N') {
                countN[i]++;
            }
        }
        for (int i=size-1; i>=0; i--) {
            countY[i] = countY[i+1];
            if (customers.charAt(i) == 'Y') {
                countY[i]++;
            }
        }
        int mn = Integer.MAX_VALUE;
        int ans = 0;
        for (int idx=0; idx<=size; idx++) {
            int s = countN[idx] + countY[idx];
            if (s < mn) {
                mn = s;
                ans = idx;
            }
        }
        return ans;
    }
}

// One-pass solution
class Solution {
    public int bestClosingTime(String customers) {
        int ans = 0;
        int curr = 0, min = 0;
        for (int i=0; i<customers.length(); i++) {
            if (customers.charAt(i) == 'Y') {
                curr--;
            } else {
                curr++;
            }
            if (curr < min) {
                min = curr;
                ans = i + 1;
            }
        }
        return ans;
    }
}
