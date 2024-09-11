class Solution {
    public String convertDateToBinary(String date) {
        StringBuilder sb = new StringBuilder();
        for (String d: date.split("-")) {
            sb.append(dec2Bin(Integer.parseInt(d))).append("-");
        }
        return sb.substring(0, sb.length()-1);
    }

    public String dec2Bin(int dec) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (dec != 0) {
            sb.append(dec%2);
            dec /= 2;
        }
        return sb.reverse().toString();
    }
}
