class Solution {
    public int findMin(int[] nums) {
        int  n= nums.length;
        int mini = Integer.MAX_VALUE;
        int left =0,right = n-1;
        while(left <= right){
            int mid = (left + right)/2;
            if(nums[left]<= nums[right]){
                mini = Math.min(mini,nums[left]);
                break;
            }
            
            if(nums[left] <= nums[mid]){
                mini = Math.min(mini,nums[left]);
                left = mid+1;
                
            }
            else{
                mini = Math.min(mini,nums[mid]);
                right = mid-1;
                
            }
        }
        return mini;
    }
}