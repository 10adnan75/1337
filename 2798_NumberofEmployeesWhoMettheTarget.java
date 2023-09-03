// Need to work!
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        Arrays.sort(hours);
        int lo = 0, hi = hours.length - 1;
        int idx = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (hours[mid] == target) {
                idx = mid;
                hi = mid - 1;
            } else if (hours[mid] < target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return idx == -1 ? 0 : hours.length - idx;
    }
}

// Brute force
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int c = 0;
        for (int h : hours) {
            if (h >= target) {
                c++;
            }
        }
        return c;
    }
}
