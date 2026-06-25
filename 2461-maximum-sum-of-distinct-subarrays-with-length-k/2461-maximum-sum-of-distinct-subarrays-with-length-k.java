class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        int l = 0,r = 0;
        long sum = 0,max = 0;
        int dup = 0;
        HashMap<Integer,Integer> mpp = new HashMap<>();
        while(r<n){
            sum += nums[r];
            int fre = mpp.getOrDefault(nums[r],0);
            if(fre == 1) dup++;
            mpp.put(nums[r],fre+1);
            while(l<=r && (dup > 0 || r-l+1 > k)){
                sum -= nums[l];
                fre = mpp.getOrDefault(nums[l],0);
                fre--;
                if(fre == 1) dup--;
                mpp.put(nums[l],fre);
                l++;
                
            }
            if(r-l+1 == k && dup == 0){
                max = Math.max(max,sum);

            }
            r++;
        }
        return max;
    }
}