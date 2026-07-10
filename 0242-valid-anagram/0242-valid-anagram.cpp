class Solution {
public:
    bool isAnagram(string s, string t) {
        unordered_map<char,int> mapS,mapT;
        int n = s.size();
        int m = t.size();
        if(n != m) return false;
        for(int i=0;i<n;i++){
            mapS[s[i]]++;
            mapT[t[i]]++;
        }
        if(mapS == mapT) return true;
        return false;

    }
};