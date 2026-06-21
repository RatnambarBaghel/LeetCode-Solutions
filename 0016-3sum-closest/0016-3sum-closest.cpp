class Solution {
public:
    int threeSumClosest(vector<int>& nums, int target) {
        int n = nums.size();
        sort(nums.begin(),nums.end());
        int closest = nums[0]+nums[0+1]+nums[n-1];
        for(int i= 0;i<n;i++){
            int l = i+1;
            int r = n-1;
            while(l<r){
                int sum = nums[i] + nums[l] + nums[r];
                if(abs(sum-target) < abs(closest - target)) {
                    closest = sum;
                }
                if(sum < target) l++;
                else r--;

            }
        }
        return closest;
    }
};