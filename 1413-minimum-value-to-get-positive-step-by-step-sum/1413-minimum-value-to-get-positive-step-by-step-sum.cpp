class Solution {
public:
    int minStartValue(vector<int>& nums) {
        int n = nums.size();
        long long sum = 0;
        long long minSum = 0;
        for(int x : nums){
            sum += x;
            minSum = min(minSum , sum);
        }
        return 1-minSum;
    }
};