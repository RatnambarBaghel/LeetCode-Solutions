class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int n = s.size();
        map<int, int> map;
        int ans = 0;
        int l =0,r=0;
        while(r < n){
            char ch = s[r];
            if(map.find(ch) != map.end()){
                l = max(l, map[ch]+1);
            }

            map[ch] = r;
            ans = max(ans , r-l+1);
            r++;
        }
        return ans;
    }
};