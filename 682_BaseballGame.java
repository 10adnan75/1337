class Solution {
    public int calPoints(String[] operations) {
        int sum = 0;
        int idx = 0;
        int[] points = new int[60001];
        for (int i=0; i<operations.length; i++) {
            switch(operations[i]) {
                case "+" :
                    points[idx] = points[idx-2] + points[idx-1];
                    idx++;
                    break;

                case "D" :
                    points[idx] = points[idx-1] * 2;
                    idx++;
                    break;

                case "C" :
                    points[--idx] = 0;
                    break;

                default : 
                    points[idx++] = Integer.valueOf(operations[i]);
            }
        }
        for (int i=0; i<idx; i++) {
            sum += points[i];
        }
        return sum;
    }
}
