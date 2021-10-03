// Naive approach - Runtime: 9 ms, Memory Usage: 41.6 MB
/* class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> myMap = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            if(myMap.containsKey(nums[i])) {
                myMap.put(nums[i], myMap.get(nums[i])+1);
            } else {
                myMap.put(nums[i], 1);  
            }
        }
        int singleNo = 0;
        for(int k=0; k<nums.length; k++) {
            if(myMap.get(nums[k]) == 1) return nums[k];
        }
        return 0;
    }
} */

// Optimal approach - Runtime: 0 ms, Memory Usage: 38.7 MB
class Solution {
    public int singleNumber(int[] nums) {
        
        int singleNo = nums[0];
        
        for(int k=1; k<nums.length; k++) {
            singleNo ^= nums[k];
        }
        
        return singleNo;
    }
}
