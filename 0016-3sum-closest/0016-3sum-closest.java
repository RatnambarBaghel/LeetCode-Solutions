class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int closest = nums[0] + nums[0+1] + nums[n-1];
        for(int i =0;i<n;i++){
            int left = i+1;
            int right = n-1;
            while (left < right){

                int currentSum = nums[i] +nums[left] + nums[right];

                if(Math.abs(currentSum - target) < Math.abs(closest - target)){
                    closest = currentSum;
                }
                if(currentSum < target) left++;
                else right--;
            }
        }
        
        return closest;
    }
}