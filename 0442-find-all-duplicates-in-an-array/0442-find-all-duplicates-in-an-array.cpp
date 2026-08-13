class Solution {
public:
    vector<int> findDuplicates(vector<int>& nums) {
        vector<int> ans;
        unordered_map<int,int> map;
        for(int x: nums){
            if(map.find(x) != map.end()){
                ans.push_back(x);
            }else{
                map[x];
            }
        }
        return ans;
        
    }
};