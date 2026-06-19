class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int n = nums.size();
        int expectedSum = 0;
        for(int i =0; i <= n;i++){
            expectedSum += i;
        }
        int actualSum = 0;
        for(int i = 0; i< n; i++){
            actualSum += nums[i];
        }
        return expectedSum - actualSum;
        
    }
};