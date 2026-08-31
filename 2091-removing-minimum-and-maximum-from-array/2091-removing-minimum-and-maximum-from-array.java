class Solution {
    public int minimumDeletions(int[] nums) {
        int n= nums.length;
        int minIdx=-1,maxIdx=-1;
        int mini=Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            if(nums[i] > maxi){
                maxi = nums[i];
                maxIdx = i;
            }
            if(nums[i] < mini){
                mini= nums[i];
                minIdx=i;
            }

        }

        int lftDel = Math.max(minIdx,maxIdx)+1;
        int rgtDel = n - Math.min(minIdx,maxIdx);
        int bthDel = Math.min(minIdx,maxIdx)+1 + n-Math.max(minIdx,maxIdx);

        return Math.min(lftDel, Math.min(rgtDel, bthDel));
        

    }
}