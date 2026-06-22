class Solution {
public:
    int minLights(vector<int>& lights) {
        int n = lights.size();
        std::vector<int> prefix(n, 0);
        for(int i =0;i<n;i++){
            if(lights[i] == 0) continue;
            int l = max(0,i-lights[i]);
            int r = min(n-1,i+lights[i]);
            prefix[l]++;
            if(r+1 < n) prefix[r+1]--;
        }
        for(int i=1;i<n;i++){
            prefix[i] += prefix[i-1];
        }
        int count = 0, ans =0;
        for(int i =0;i<n;i++){
            if(prefix[i] == 0) count++;
            else{
                ans += ceil(count/3.0);
                count =0;
            }
        }
        ans += ceil(count/3.0);
        return ans;
    }
};