class Solution {
public:
    int maxProduct(vector<int>& nums) {
        int n = nums.size();
        int ans =0;
        int maxi = INT_MIN;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int prod = nums[i] * nums[j];
                if(prod > maxi){
                    maxi = prod;
                    ans = (nums[i]-1) *(nums[j]-1);
                }
            }
        }
        return ans;

    }
};