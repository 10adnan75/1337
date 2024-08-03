// Need to work on this!
// class Solution {
//     public boolean canBeEqual(int[] target, int[] arr) {
//         int[] freq = new int[1001];
//         for (int i=0; i<target.length; i++) {
//             freq[target[i]]++;
//             freq[arr[i]]++;
//         }
//         for (int i : freq) {
//             if ((i & 1) == 1) {
//                 return false;
//             }
//         }
//         return true;
//     }
// }

// 2 ms
class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int[] freqTarget = new int[1001];
        int[] freqArr = new int[1001];
        for (int i=0; i<target.length; i++) {
            freqTarget[target[i]]++;
            freqArr[arr[i]]++;
        }
        for (int i=0; i<1001; i++) {
            if (freqTarget[i] != freqArr[i]) {
                return false;
            }
        }
        return true;
    }
}

// 1 ms
class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int[] freq = new int[1001];
        for (int i=0; i<target.length; i++) {
            freq[target[i]]++;
            freq[arr[i]]--;
        }
        for (int i : freq) {
            if (i > 0 || i < 0) {
                return false;
            }
        }
        return true;
    }
}

// Aug 4, 2024
class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int[] freq = new int[1001];
        for (int i: target) {
            freq[i]++;
        }
        for (int i: arr) {
            freq[i]--;
        }
        for (int i: freq) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}
