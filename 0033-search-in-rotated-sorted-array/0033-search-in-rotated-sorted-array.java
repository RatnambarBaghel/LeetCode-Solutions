class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        // int left = 0,right = n-1;
        int ans =-1;
        // while(left <= right){
        //     int mid = (left+right)/2;
        //     if(nums[mid] == target){
        //         ans = mid;
        //     }
        //     if(nums[mid] < target){
                
        //     }
        //     else{
        //         left = mid+1;
        //     }
        // }
        for(int i=0;i<n;i++){
            if(nums[i] == target){
                ans = i;
            }
        }
        return ans;
    }
}