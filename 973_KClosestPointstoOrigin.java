class Solution {
    private int[][] points;
    
    public int[][] kClosest(int[][] points, int k) {
        this.points = points;
        helper(0, points.length-1, k);
        int[][] ans = new int[k][2];
        for (int i=0; i<k; i++) {
            ans[i] = points[i];
        }
        return ans;
    }
    
    private void helper(int l, int r, int num) {
        int pivot = l + ThreadLocalRandom.current().nextInt(r-l+1);
        swap(l, pivot);
        int part = partition(l, r);
        int leftSize = part-l+1;
        if (leftSize == num) {
            return;
        }
        if (leftSize > num) {
            helper(l, part, num);
        } else {
            helper(part+1, r, num-leftSize);
        }
    }
    
    private void swap(int x, int y) {
        int[] temp = points[x];
        points[x] = points[y];
        points[y] = temp;
    }
    
    private int distance(int i) {
        return (int)(Math.pow(points[i][0], 2) + Math.pow(points[i][1], 2));
    }
    
    private int partition(int l, int r) {
        int value = distance(l);
        int k = l + 1;
        for (int i=l+1; i<=r; i++) {
            if (distance(i) <= value) {
                swap(i, k);
                k++;
            }
        }
        return k-1;
    }
}
