class Solution {
    public int findDuplicate(int[] nums) {
        int dup =0;
        Arrays.sort(nums);
        for(int num:nums){
            if(dup == num){
                return dup;
            }
            dup = num;
        }
        return dup;
    }
}