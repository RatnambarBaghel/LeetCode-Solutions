class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double avg = 0;
        double sum = 0;
        double ans =0;
        for(int i=0;i<k;i++){
            sum += nums[i];
        }
        avg = sum/k;
        ans = avg;
        for(int  i=k;i<n;i++){
            sum += nums[i];
            sum -= nums[i-k];
            avg = sum/k;
            ans = Math.max(ans,avg);
        }
        return ans;
    }
}