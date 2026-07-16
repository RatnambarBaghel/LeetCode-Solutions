class Solution {
public:
    vector<int> findAnagrams(string s, string p) {
        int n = s.size();
        int m = p.size();

        vector<int> f1(26 ,0);
        vector<int> f2(26, 0);
        vector<int> ans;

        for(int i=0;i<m;i++){
            f2[p[i] - 'a']++;
        }
        int i=0,j=0;
        while(j < n){
            f1[s[j] - 'a']++;
            if(j-i+1 > m){
                f1[s[i] - 'a']--;
                i++;
            }
            if(f1 == f2){
                ans.push_back(i);
            }
            j++;
        }
        return ans;
    }
};