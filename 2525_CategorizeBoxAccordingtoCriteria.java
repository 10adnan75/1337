class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        double c = Math.pow(10, 4);
        long v = (long) length * width * height;
        if (v >= Math.pow(10, 9) || length >= c || width >= c || height >= c || mass >= c) {
            if (mass >= 100) {
                return "Both";
            } else {
                return "Bulky";
            } 
        } 
        if (mass >= 100) {
            return "Heavy";
        }
        return "Neither";
    }
}
