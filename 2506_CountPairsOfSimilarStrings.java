class Solution {
    public int similarPairs(String[] words) {
        int[][] frequency = new int[words.length][26];
        int index = 0;
        for (String word : words) {
            for (int i=0; i<word.length(); i++) {
                frequency[index][word.charAt(i) - 'a'] = 1;
            }
            index++;
        }
        int count = 0;
        // for (int[] freq : frequency) {
        //     for (int i=0; i<freq.length; i++) System.out.print(freq[i] + " ");
        //     System.out.println();
        // }
        for (int i=0; i<frequency.length; i++) {
            for (int j=i+1; j<frequency.length; j++) {
                boolean flag = true;
                int idx = 0;
                while (idx < 26) {
                    if (frequency[i][idx] != frequency[j][idx]) {
                        flag = false;
                        break;
                    }
                    idx++;
                }
                if (flag) {
                    count++;
                }
            }
        }
        return count;
    }
}
