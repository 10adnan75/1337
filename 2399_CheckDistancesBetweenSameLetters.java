class Solution {
    private int[] letters = new int[26];

    public boolean checkDistances(String s, int[] distance) {
        for (int i=0; i<letters.length; i++) {
            letters[i] = -1;
        }
        for (int i=0; i<s.length(); i++) {
            int idx = letters[s.charAt(i) - 'a'];
            if (idx == -1) {
                letters[s.charAt(i) - 'a'] = i;
                continue;
            }
            if (idx != -1) {
                letters[s.charAt(i) - 'a'] = i - idx - 1;
            }
        }
        // for (int i : letters) System.out.print(i + " ");
        for (int i=0; i<distance.length; i++) {
            if (letters[i] != -1) {
                if (letters[i] != distance[i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
