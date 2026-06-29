class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int ans =-1;
        int maxFre = 0;
        for(int num : nums){
            mpp.put(num,mpp.getOrDefault(num,0)+1);
        }
        for(int key: mpp.keySet()){
            if(mpp.get(key)> maxFre){
                maxFre = mpp.get(key);
                ans = key;
            }
        }
        return ans;
    }
}