class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int ans = nums[0];
        int sum = 1;
        for(int i=0;i<n;i++){
            // sum *= nums[i];
            // if(sum > ans) ans = sum;
            // if(sum <= 0) sum =1;
            for(int j=i;j<n;j++){
                sum *= nums[j];
                ans = Math.max(ans,sum);
            }
            sum =1;
        }
        return ans;
    }
}