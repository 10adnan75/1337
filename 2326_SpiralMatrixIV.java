/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] matrix = generateMatrix(m, n);
        int[][] dir = {{0,1}, {1,0}, {0,-1}, {-1,0}};
        int i = 0, j = 0, currDir = 0;
        while (head != null) {
            matrix[i][j] = head.val;
            int newi = i + dir[currDir][0], newj = j + dir[currDir][1];
            if (newi < 0 || newi >= m || newj < 0 || newj >= n || matrix[newi][newj] != -1) {
                currDir = (currDir + 1) % 4;
            }
            i += dir[currDir][0];
            j += dir[currDir][1];
            head = head.next;
        }
        return matrix;
    }

    public int[][] generateMatrix(int m, int n) {
        int[][] a = new int[m][n];
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                a[i][j] = -1;
            }
        }
        return a;
    }
}
