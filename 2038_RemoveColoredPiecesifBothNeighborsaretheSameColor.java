class Solution {
    public boolean winnerOfGame(String colors) {
        int cA = 0, cB = 0, sumA = 0, sumB = 0;
        for (int i=0; i<colors.length(); i++) {
            if (colors.charAt(i) == 'A') {
                if (cB >= 3) {
                    sumB += (cB-2);
                }
                cB = 0;
                cA++;
            } else {
                if (cA >= 3) {
                    sumA += (cA-2);
                } 
                cA = 0;
                cB++;
            }
        }
        if (cA >= 3) {
            sumA += (cA-2);
        }
        if (cB >= 3) {
            sumB += (cB-2);
        }
        return sumA > sumB;
    }
}
