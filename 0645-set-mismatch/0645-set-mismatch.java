class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int expectedSum = (n *(n+1))/2;
        int prev =0;
        int fix =0,sum =0;
        int[] ans = new int[2];
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(prev == nums[i]){
                fix = prev;
                continue;
            }
            sum += nums[i];
            prev = nums[i];
        }
        ans[0] = fix;
        ans[1] = expectedSum - sum;
        return ans;
    }
}