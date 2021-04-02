class Solution {
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
}
