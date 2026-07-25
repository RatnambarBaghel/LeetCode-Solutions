class Solution {
public:
    int maxProduct(int n) {
        vector<int> copy;
        while(n>0){
            int rem = n % 10;
            copy.push_back(rem);
            n /= 10;
        }
        int m = copy.size();
        int ans =0;
        for(int i=0;i<m;i++){
            for(int j=i+1;j<m;j++){
                int prod=  copy[i] * copy[j];
                ans = max(ans,prod);
            }
        }
        return ans;
    }
};