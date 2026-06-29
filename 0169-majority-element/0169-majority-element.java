class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int candidate = nums[0];
        int count =0;
        for(int i =0;i<n;i++){
            int curr = nums[i];
            if(count == 0){
                candidate = curr;
            }
            if(curr == candidate) count++;
            else count--;
        }
        return candidate;
    }
}