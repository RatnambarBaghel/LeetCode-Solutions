class Solution {
public:
    bool isPossibleToSplit(vector<int>& nums) {
        unordered_map<int,int> map;
        for(int x: nums){
            map[x]++;
            if(map[x]>2){
                return false;
            }
        }
        return true;
    }
};