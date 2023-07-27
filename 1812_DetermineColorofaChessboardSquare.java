// My code
class Solution {
    public boolean squareIsWhite(String coordinates) {
        return ((int)(coordinates.charAt(0)-'a' & 1) == 1 && (int)(coordinates.charAt(1)-'0' & 1) == 1) || ((int)(coordinates.charAt(0)-'a' & 1) == 0 && (int)(coordinates.charAt(1)-'0' & 1) == 0);
    }
}

// Optimized
class Solution {
    public boolean squareIsWhite(String coordinates) {
        return ((int)(coordinates.charAt(0)-'a') + (int)(coordinates.charAt(1)-'0') & 1) == 0;
    }
}
