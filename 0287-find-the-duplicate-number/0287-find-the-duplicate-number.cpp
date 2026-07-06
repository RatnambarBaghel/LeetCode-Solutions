class Solution {
public:
    int findDuplicate(vector<int>& nums) {
        unordered_map<int , int> map;
        int dup =0;
        for(int num:nums){
            map[num]++;
        }
        for(auto &entry: map){
            if(entry.second > 1){
                dup = entry.first;
            }
        }
        return dup;

    }
};