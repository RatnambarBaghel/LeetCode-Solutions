class Solution {
public:
    int findKthLargest(vector<int>& nums, int k) {
        // Brute force
        int n = nums.size();
        sort(nums.begin(),nums.end());
        int j = n-1;
        while(k > 0){
            j--;
            k--;
            if(k == 0){
                return nums[j+1];
            }
        }
        return 0;
        
    }
};