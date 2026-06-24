class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n = nums.length;
        int ans =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int prefixSum =0;
        for(int i =0;i<n;i++){
            prefixSum += nums[i];

            ans += map.getOrDefault(prefixSum - goal, 0);

            map.put(prefixSum,map.getOrDefault(prefixSum, 0) + 1);
        }
        return ans;
        
    }
}