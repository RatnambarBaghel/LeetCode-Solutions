class Solution {
    public int maxFrequencyElements(int[] nums) {
        int ans =0;
        int maxi =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x: nums){
            map.put(x,map.getOrDefault(x,0)+1);
            maxi = Math.max(maxi,map.get(x));
        }
        for(int x: map.keySet()){
            if(map.get(x) == maxi){
                ans += map.get(x); 
            }
        }
        return ans;
        
    }
}