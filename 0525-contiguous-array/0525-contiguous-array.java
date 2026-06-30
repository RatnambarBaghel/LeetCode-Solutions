class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int ans =0;
        int sum =0;
        for(int i =0;i<n;i++){
            if(nums[i] ==0) sum +=-1;
            else sum +=1;
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
            else{
                ans = Math.max(ans,(i-map.get(sum)));
            }
        }
        return ans;
    }
}