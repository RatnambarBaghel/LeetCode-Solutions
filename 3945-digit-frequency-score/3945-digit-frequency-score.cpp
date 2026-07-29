class Solution {
public:
    int digitFrequencyScore(int n) {
        int temp = n;
        unordered_map<int,int> freq;
        set<int> st;
        while(temp >0){
            int rem = temp % 10;
            freq[rem]++;
            st.insert(rem);
            temp /= 10;
        }
        int ans = 0;
        for(int x: st){
            int sum = x * freq[x];
            ans += sum;
        }
        return ans;
        
    }
};