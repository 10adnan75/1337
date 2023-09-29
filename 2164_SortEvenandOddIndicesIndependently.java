// ArrayList
// Runtime: 7 ms, Beats: 7.53%
// Memory: 44 MB, Beats: 18.91%
class Solution {
    public int[] sortEvenOdd(int[] nums) {
        List<Integer> even = new ArrayList<>(), odd = new ArrayList<>();
        for (int i=0; i<nums.length; i++) {
            if ((i&1) == 1) {
                odd.add(nums[i]);
            } else {
                even.add(nums[i]);
            }
        }
        Collections.sort(even);
        Collections.sort(odd, Collections.reverseOrder());
        int oddI = 0, evenI = 0;
        for (int i=0; i<nums.length; i++) {
            if ((i&1) == 1) {
                nums[i] = odd.get(oddI++);
            } else {
                nums[i] = even.get(evenI++);
            }
        }
        return nums;
    }
}

// Array
// Runtime: 1 ms, Beats: 100%
// Memory: 43.2 MB, Beats: 96.67%
class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int[] odd = new int[101], even = new int[101];
        for (int i=0; i<nums.length; i++) {
            if ((i&1) == 1) {
                odd[nums[i]]++;
            } else {
                even[nums[i]]++;
            }
        }
        int idx = 0;
        for (int i=1; i<even.length; i++) {
            while (even[i]-- > 0) {
                nums[idx] = i;
                idx += 2;
            }
        }
        idx = 1;
        for (int i=odd.length-1; i>0; i--) {
            while (odd[i]-- > 0) {
                nums[idx] = i;
                idx += 2;
            }
        }
        return nums;
    }
}

// PriorityQueue
