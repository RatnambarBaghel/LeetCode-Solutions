class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int size = n*(n+1)/2;
        long sums[] = new long[size];
        long sum =0;
        int  k=0;
        for(int i = 0;i<n;i++){
            for(int j =i;j<n;j++){
                sum += nums[j];
                sums[k++] = sum;
            }
            sum =0;
        }
        Arrays.sort(sums);
        long MOD = 1_000_000_007;
        long ans = 0;
        for(int i = left-1;i<right;i++){
            ans = (ans + sums[i]) % MOD;
        }
        return (int)ans;
    }
}