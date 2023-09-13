class Solution {
public:
    int minDeletionSize(vector<string>& strs) {
        int count = 0;
        for(int i = 0; i < strs[0].size(); i++) {
            bool flag = false;
            for(int j = 0; j < strs.size()-1; j++) {
                if(strs[j][i] - 'a' > strs[j+1][i] - 'a') {
                    flag = true;
                }
            }
            if(flag) {
                count++;
            }
        }

        return count;
    }
};
