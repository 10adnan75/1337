class Solution {
public:
    int candy(vector<int>& ratings) {
        vector<int> left(ratings.size(),1), right(ratings.size(),1);

        for(int i = 1; i < ratings.size(); i++) {
            if(ratings[i]>ratings[i-1]) {
                left[i] = left[i-1] + 1;
            }
        }

        for(int i = ratings.size()-2; i >= 0 ; i--) {
            if(ratings[i]>ratings[i+1]) {
                right[i] = right[i+1] + 1;
            }
        }

        int res = 0;

        for(int i = 0; i < ratings.size() ; i++) {
            res += max(left[i],right[i]);
        }

        return res;
    }
};
