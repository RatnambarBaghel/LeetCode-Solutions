class Solution {
public:
    bool isIsomorphic(string s, string t) {
        int n= s.size();
        unordered_map<char,char> map;
        for(int i=0; i<n; i++){
            if(map.find(s[i]) == map.end()){
                for (auto &p : map) {
                    if (p.second == t[i]) return false;
                }
                map[s[i]] = t[i];
            }
            else{
                if(map[s[i]] != t[i]) return false;
            }
        }
        return true;
    }
};