class Solution {
public:
    int smallestEvenMultiple(int n) {
        int ans = INT_MAX;
        for(int i=2;i<=(n*2);i++){
            if(i%2 == 0 && i%n == 0){
                ans= min(ans,i);
            }
        }
        return ans;
    }
};