// Brute force
// MH, IN
class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        while (k-- > 0) {
            nums[getMin(nums)] *= multiplier;
        }
        return nums;
    }

    public int getMin(int[] a) {
        int min = Integer.MAX_VALUE, id = 0, minIdx = 0;
        for (int i: a) {
            if (min > i) {
                min = i;
                minIdx = id;
            }
            id++;
        }
        return minIdx;
    }
}

// Priority queue
// WA, USA
import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<int[]> numsPriority = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] == o2[0] ? o1[1] - o2[1] : o1[0] - o2[0];
            }
        });
        
        for (int i = 0; i < nums.length; i++) {
            numsPriority.add(new int[] {nums[i], i});
        }
        
        while (k-- > 0) {
            int[] temp = numsPriority.poll();
            if (temp == null) break;
            numsPriority.add(new int[] {temp[0]*multiplier, temp[1]});
        }
        
        while (!numsPriority.isEmpty()) {
            int[] temp = numsPriority.poll();
            nums[temp[1]] = temp[0];
        }
        
        return nums;
    }
}
