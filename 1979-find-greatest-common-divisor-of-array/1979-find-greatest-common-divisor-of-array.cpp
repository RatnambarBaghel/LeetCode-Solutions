class Solution {
public:
    int findGCD(vector<int>& nums) {
        int n = nums.size();
        int ans = 0;
        int mini = INT_MAX;
        int maxi = INT_MIN;
        for(int x: nums){
            mini = min(mini,x);
            maxi = max(maxi, x);
        }
        for(int i=1;i<=maxi;i++){
            if(mini%i == 0 && maxi%i== 0){
                ans = max(ans, i);
            }
        }
        return ans;
    }
};