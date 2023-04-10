/* 
class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
        long long cur = digits.size() - 1;
        long long weight = 0;
        long long i = 0;
        while (cur > -1) {
            weight += digits[i++] * pow(10, cur--);
        }
        weight++;
        long long newArrLength = 0;
        long long dummyWeight = weight;
        while (dummyWeight > 0) {
            newArrLength++;
            dummyWeight /= 10;    
        }
        vector<int> res(newArrLength);
        i = res.size() - 1;
        while (i >= 0) {
            res[i--] = (weight % 10) ;
            weight /= 10;
        }
        return res;
    }
};
*/

class Solution {
    public int[] plusOne(int[] digits) {
        int cur = digits.length - 1;
        while (cur >= 0 && digits[cur] == 9) {
            cur--;
        }
        if (cur == -1) {
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            return newDigits;
        }
        int[] newDigits = new int[digits.length];
        newDigits[cur] = digits[cur] + 1;
        for (int i = 0; i < cur; i++) {
            newDigits[i] = digits[i];
        }
        return newDigits;
    }
}
