class Solution {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[] {-1, -1};
        } else if (nums.length == 1) {
            if (nums[0] == target) {
                return new int[] {0, 0};
            } else {
                return new int[] {-1, -1};
            }
        } 
        int[] result = new int[2];
        int start = 0;
        int end = nums.length-1;
        int first = -1;
        int second = -1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start  = mid + 1;
            } else {
                if (nums[start] == target) {
                    first = start;
                    break;
                } else {
                    end = mid;
                }
            }
        }
        if (nums[start] == target) {
            first = start;
        }
        start = 0;
        end = nums.length-1;
        while(start < end) {
            int mid = (start + end) / 2;
            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start  = mid + 1;
            } else {
                if (nums[end] == target) {
                    second = end;
                    break;
                } else {
                    if (start != mid) {
                        start = mid;
                    } else {
                        second = start;
                        break;
                    }
                }
            }
        }
        if (end >= 0 && nums[end] == target) {
            second = end;
        }
        result[0] = first;
        result[1] = second;
        return result;
    }
}
