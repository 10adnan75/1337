//Memory: 41.9 MB
class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String s : sentences) {
            String[] words = s.split(" ");
            if (words.length > max) {
                max = words.length;
            }
        }
        return max;
    }
}

// Memory: 42.5 MB
class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String s : sentences) {
            max = Math.max(max, s.split(" ").length);
        }
        return max;
    }
}
