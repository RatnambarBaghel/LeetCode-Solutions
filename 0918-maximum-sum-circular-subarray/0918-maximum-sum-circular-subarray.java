class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int maxiSub = Integer.MIN_VALUE;
        int miniSub = Integer.MAX_VALUE;
        for(int i=0; i <n; i++){
            sum += nums[i];
            maxiSub = Math.max(maxiSub,sum);
            if(sum < 0) sum =0;
        }
        sum =0;
        for(int i =0;i<n;i++){
            sum += nums[i];
            miniSub = Math.min(miniSub,sum);
            if(sum > 0) sum =0;
        }
        int totalSum =0;
        for(int i=0;i<n;i++){
            totalSum += nums[i];
        }
        if (maxiSub < 0) return maxiSub;

        return Math.max(maxiSub, totalSum - miniSub);
    }
}