class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int ans =-1;
        int[] prefixSum = new int[n+1];
        prefixSum[0] = 0;
        for(int i=1;i<=n;i++){
            prefixSum[i] = prefixSum[i-1] + nums[i-1];
        }
        for(int i =1;i<=n;i++){
            int leftSum = prefixSum[i-1];
            int rightSum = prefixSum[n] -prefixSum[i];
            if(leftSum == rightSum) return i-1;
        }
        return ans;
    }
}