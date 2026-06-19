class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = 0;
        for(int i = 0;i<=n;i++){
            expectedSum += i;
        }
        int actualSum =0;
        for (int i=0; i< n;i++){
            actualSum += nums[i];
        }
        int missing = expectedSum - actualSum;
        return missing;
    }
}