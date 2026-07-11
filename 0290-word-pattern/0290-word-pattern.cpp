class Solution {
public:
    vector<string> split(const string &s, char delimeter){
        vector<string> tokens;
        string token;
        stringstream ss(s);

        while(getline(ss, token, delimeter)){
            tokens.push_back(token);
        }
        return tokens;
    }
    bool wordPattern(string pattern, string s) {
        int n = pattern.size();
        vector<string> words = split(s , ' ');
        unordered_map<char,string> map;
        int m = words.size();
        if(n != m) return false;

        for(int i=0;i<n;i++){
            if(map.find(pattern[i]) == map.end()){
                for(auto &p : map){
                    if(p.second == words[i]) return false;
                }
                map[pattern[i]] = words[i];
            }
            else{
                if(map[pattern[i]] != words[i]) return false;
            }
        }
        return true;
    }
};