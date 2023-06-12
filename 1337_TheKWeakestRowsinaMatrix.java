// Worst case == Best case, not an efficient approach!
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int key = 0;
        int[] soldiers = new int[mat.length];
        for (int[] row : mat) {
            int val = 0;
            for (int i : row) {
                if (i == 1) {
                    val++;
                }
            }
            soldiers[key++] = val;
        }
        int[] ans = new int[k];
        for (int i=0; i<k; i++) {
            int minIdx = 0;
            int j = 0;
            while (j < soldiers.length) {
                if (soldiers[j] < soldiers[minIdx]) {
                    minIdx = j;
                }
                j++;
            }
            ans[i] = minIdx;
            soldiers[minIdx] = Integer.MAX_VALUE;
        }
        return ans;
    }
}

// Efficacious solution
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int key = 0;
        int[] soldiers = new int[mat.length];
        for (int[] row : mat) {
            int val = 0;
            for (int i : row) {
                if (i == 1) {
                    val++;
                }
            }
            soldiers[key++] = val;
        }
        int[] ans = new int[k];
        for (int i=0; i<k; i++) {
            int minIdx = i;
            int j = i + 1;
            while (j < soldiers.length) {
                if (soldiers[j] < soldiers[minIdx]) {
                    minIdx = j;
                }
                j++;
            }
            ans[i] = soldiers[i];
            soldiers[i] = soldiers[minIdx];
            soldiers[minIdx] = ans[i];
            ans[i] = ?;
        }
        return ans;
    }
}
