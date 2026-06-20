class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int prefix[] = new int[n];
        int suffix[] = new int[n];
        prefix[0]=1;
        for(int i=1;i<n;i++){
            if(ratings[i-1]  < ratings[i]){
                prefix[i] = prefix[i-1]+1;
            }
            else prefix[i] =1;
        }
        suffix[n-1] =1;
        for(int i = n-2;i>=0;i--){
            if(ratings[i] > ratings[i+1]){
                suffix[i] = suffix[i+1]+1;
            }
            else suffix[i] =1;
        }
        int ans = 0;
        for(int i=0;i<n;i++){
            if(prefix[i] > suffix[i]){
                ans += prefix[i];
            }
            else ans += suffix[i];
        }
        return ans;
    }
}