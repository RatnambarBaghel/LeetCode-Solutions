class Solution {
public:
    bool canConstruct(string ransomNote, string magazine) {
        int n = ransomNote.size();
        int m = magazine.size();
        unordered_map<char,int> map;
        for(int i=0; i<n; i++){
            map[ransomNote[i]]++;
        }
        for(int i=0; i<m;i++){
            auto it = map.find(magazine[i]);
            if(it != map.end()){
                it->second--;
                if(it->second == 0){
                    map.erase(magazine[i]);
                }
            }
        }
        if(map.empty()) return true;
        return false;
    }
};