class Solution {
public:
    vector<int> shuffle(vector<int>& nums, int n) {
        int len = nums.size();
        vector<int> ans;
        int left = 0, right =n;
        while(left <n && right < len){
            ans.push_back(nums[left]);
            left++;
            ans.push_back(nums[right]);
            right++;
        }
        return ans;
    }
};