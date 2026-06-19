class Solution {
    public  int[] twoSum(int[] nums, int target) {
            int n = nums.length;
            HashMap<Integer,Integer> mpp = new HashMap<>();
            for(int i=0;i<n;i++){
                int b = target - nums[i];
                if(mpp.containsKey(b) == true){
                    return new int[]{mpp.get(b),i};
                }
                mpp.put(nums[i],i);
            }
            return new int[]{-1};
         }
}