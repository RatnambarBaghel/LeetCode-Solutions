class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int l =0,r=0;
        int maxlen = 0;
        int zeroCnt =0;
        while(r<n){
            if(nums[r] == 0) zeroCnt++;
            while(l<=r && zeroCnt > k){
                if(nums[l] == 0) zeroCnt--;
                l++;
            }
            maxlen = Math.max(maxlen,r-l+1);
            r++;

        }
        return maxlen;
    }
}