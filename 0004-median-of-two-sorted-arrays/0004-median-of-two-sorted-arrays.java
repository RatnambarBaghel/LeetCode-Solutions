class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] merge = new int[n+m];
        double ans = 0.00000;
        for(int i=0;i<n;i++) merge[i] = nums1[i];
        for(int i=0;i<m;i++) merge[i+n] = nums2[i];
        Arrays.sort(merge);
        int len = merge.length;
        
        if(len % 2 == 0){
            ans = (merge[(len/2)-1] + merge[len/2]) / 2.0;
        }
        else ans = merge[len/2];
    
        return ans;
    }
}