class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int prefixSum =0;
        int length = 0;
        for(int i=0;i<n;i++){
            prefixSum += nums[i];
            int rem = prefixSum % k;
            if(map.containsKey(rem)) length= i- map.get(rem);
            if(length >= 2) return true;
            if(!map.containsKey(rem)){
                map.put(rem,i);
            }
        }
        return false;
    }
}