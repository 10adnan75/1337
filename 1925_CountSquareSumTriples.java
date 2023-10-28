class Solution {
    public boolean check(double n) {
        return n % 1 == 0;
    }

    public int countTriples(int n) {
        int c = 0;
        for (int a=1; a<=n; a++) {
            for (int b=1; b<=n; b++) {
                double num = Math.sqrt(a*a + b*b);
                if (check(num)) {
                    if ((int)num > n) {
                        break;
                    }
                    c++;
                } 
            }
        }
        return c;
    }
}
