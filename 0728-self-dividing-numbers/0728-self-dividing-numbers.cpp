class Solution {
public:
    vector<int> selfDividingNumbers(int left, int right) {
        vector<int> ans;
        while(left <= right){
            int sum = left;
            while(sum > 0){
                int rem = sum % 10;
                if(rem == 0) break;
                if(left % rem == 0){
                    sum /= 10;
                }else break;
            }
            if(sum == 0) ans.push_back(left);
            left++;
        }
        return ans;
    }
};