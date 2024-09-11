class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        return getColor(coordinate2) == getColor(coordinate1);
    }

    public int getColor(String coordinate) {
        return (((int)(coordinate.charAt(0)-'a')+1)+((int)(coordinate.charAt(1)-'0')))%2;
    }
}
