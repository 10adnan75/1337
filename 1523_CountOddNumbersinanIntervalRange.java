// 2062 ms
class Solution {
    public int countOdds(int low, int high) {
        int c = 0;
        for (int i=low; i<=high; i++) {
            if ((i&1) == 1) {
                c++;
            }
        }
        return c;
    }
}

// 0 ms
class Solution {
    public int countOdds(int low, int high) {
        if ((low&1) == 1 && (high&1) == 1) {
            return (high-low)/2+1;
        }
        if ((low&1) == 0 && (high&1) == 0) {
            return (high-low)/2;
        }
        return (high-low+1)/2;
    }
}
