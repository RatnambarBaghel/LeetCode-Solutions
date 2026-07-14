class Solution {
public:
    vector<int> findDisappearedNumbers(vector<int>& nums) {
        int n = nums.size();
        map<int ,int> map;
        vector<int> ans;
        for(int i=0;i<n;i++){
            map[nums[i]];
        }
        for(int i=1;i<=n;i++){
            if(map.find(i) == map.end()){
                ans.push_back(i);
            }
        }
        return ans;
    }
};