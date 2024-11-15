class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
        int n = arr.length, ans = Integer.MIN_VALUE;;
        int lo = 0, hi = n-1;

        for (int i=1; i<arr.length; i++) {
            if (arr[i] < arr[i-1]) {
                break;
            }
            lo++;
        }

        for (int i=n-2; i>=0; i--) {
            if (arr[i] > arr[i+1]) {
                break;
            }
            hi--;
        } 

        if (lo == n-1 && hi == 0) {
            return hi;
        }
        
        if (lo == 0 && hi == n-1) {
            return arr[lo] <= arr[hi] ? hi-1 : hi;
        }

        if (lo == 0 && hi != n-1) {
            return arr[lo] <= arr[hi] ? hi-1 : hi;
        } 
        
        if (lo != 0 && hi == n-1) {
            return arr[lo] <= arr[hi] ? hi-lo-1 : n-(lo+1);
        }

        ans = Math.min(n-(lo+1), hi);

        int l = lo, r = hi;
        while (r < n) {
            if (arr[l] <= arr[r]) {
                break;
            }
            r++;
        }
        ans = Math.min(ans, r-l-1);

        r = hi;
        while (l >= 0) {
            if (arr[l] <= arr[r]) {
                break;
            }
            l--;
        }
        ans = Math.min(ans, r-l-1);
        
        while (lo >= 0 && hi < n && arr[lo] > arr[hi]) {
            if (lo-1 >= 0 && hi+1 < n && (arr[lo-1] <= arr[hi] || arr[lo] <= arr[hi+1])) {
                return Math.min(ans, hi-lo);
            }
            lo--;
            hi++;
        }

        return Math.min(ans, hi-lo-1);
    }
}
