class Solution {
public:
    int findMiddleIndex(vector<int>& nums) {
        int n = nums.size();
        vector<int> preSum(n);
        vector<int> sufSum(n);
        preSum[0] = nums[0];
        sufSum[n-1] = nums[n-1];
        for(int i=1;i<n;i++){
            preSum[i] = preSum[i-1] + nums[i];
        }
        for(int i=n-2;i>=0;i--){
            sufSum[i] = sufSum[i+1] + nums[i];
        }
        for(int i=0;i<n;i++){
            if(preSum[i] == sufSum[i]){
                return i;
            }
        }
        return -1;
    }
};