class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int  n = nums.length;
        int l = 0,r = 0;
        int max = 0,dup = 0;
        HashMap<Integer,Integer> mpp = new HashMap<>();
        while(r<n){
            int fre = mpp.getOrDefault(nums[r],0);
            if(fre == k) dup++;
            mpp.put(nums[r],fre+1);
            while(l<=r && dup >0){
                fre = mpp.getOrDefault(nums[l],0);
                fre--;
                if(fre == k) dup--;
                mpp.put(nums[l],fre);
                l++;
            }
            if(dup == 0){
                max = Math.max(max,r-l+1);
            }
            r++;
        }
        return max;
    }
}