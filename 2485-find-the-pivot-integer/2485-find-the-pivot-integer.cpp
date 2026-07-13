class Solution {
public:
    int pivotInteger(int n) {
        vector<int> preSum(n+1);
        vector<int> sufSum(n+1);
        preSum[0] = 0;
        sufSum[n] = n;
        for(int i=1;i<=n;i++){
            preSum[i] = preSum[i-1] + i;
        }
        for(int i= n-1;i>=1;i--){
            sufSum[i] = sufSum[i+1] +i;
        }
        for(int i=1;i<=n;i++){
            if(preSum[i] == sufSum[i]){
                return i;
            }
        }
        return -1;
    }
};