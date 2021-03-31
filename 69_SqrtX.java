class Solution {
    public int mySqrt(int x) {
        
        if(x <= 1) {
            return x;
        }
        
        int leftBit = 0; 
        int rightBit = x;
        
        while(leftBit < rightBit - 1) {
            
            int pivot = leftBit + (rightBit - leftBit) / 2;
            
            if(pivot == x/pivot) {
                return pivot;
            }
            
            else if(x/pivot < pivot) {
                rightBit = pivot;                
            }
            
            else {
                leftBit = pivot;
            }
        }
        
        return leftBit;
    }
}
