class Solution {
public:
    bool areOccurrencesEqual(string s) {
        unordered_map<char,int> map;
        for(char &ch: s){
            map[ch]++;
        }
        int ans =map[s[0]];
        for(char &ch : s){
            if(map[ch] != ans){
                return false;
            }
        }
        return true;
        
    }
};