class Solution {
    public int getTeams(int[] a) {
        int c = 0;
        for (int i=0; i<a.length; i++) {
            for (int j=i+1; j<a.length; j++) {
                if (a[i] < a[j]) {
                    for (int k=j+1; k<a.length; k++) {
                        if (a[j] < a[k]) {
                            c++;
                        }
                    }
                }
            }
        }
        return c;
    }

    public int[] getReverse(int[] a) {
        int n = a.length;
        for (int i=0; i<n/2; i++) {
            int temp = a[i];
            a[i] = a[n-i-1];
            a[n-i-1] = temp;
        }
        return a;
    }

    public int numTeams(int[] rating) {
        return getTeams(rating) + getTeams(getReverse(rating));
    }
}
