class Solution {
    public int minStartValue(int[] nums) {
        int n = nums.length;
        long sum = 0;
        long minSum = 0;
        for(int x : nums){
            sum += x;
            minSum = Math.min(minSum , sum);
        }
        return 1-(int)minSum;
    }
}