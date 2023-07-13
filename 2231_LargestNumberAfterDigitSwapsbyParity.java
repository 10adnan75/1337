class Solution {
    public int largestInteger(int num) {
        int n = num;
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        while (n != 0) {
            int i = n % 10;
            if ((i & 1) == 1) {
                odd.add(i);
            } else {
                even.add(i);
            }
            n /= 10;
        }
        Collections.sort(odd);
        Collections.sort(even);
        int evenIdx = 0, oddIdx = 0;
        int p = 0;
        while (num != 0) {
            int i = num % 10;
            if ((i & 1) == 1) {
                n += (odd.get(oddIdx++) * Math.pow(10, p));
            } else {
                n += (even.get(evenIdx++) * Math.pow(10, p));
            }
            num /= 10;
            p++;
        }
        return n;
    }
}
