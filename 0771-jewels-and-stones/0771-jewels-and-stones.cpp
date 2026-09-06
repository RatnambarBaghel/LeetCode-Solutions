class Solution {
public:
    int numJewelsInStones(string jewels, string stones) {
        unordered_map<char,int> jewelMap;
        int ans=0;
        for(char c:jewels){
            jewelMap[c]++;
        }

        for(char c: stones){
            if(jewelMap.find(c) != jewelMap.end()){
                ans++;
            }
        }
        return ans;
        
    }
};