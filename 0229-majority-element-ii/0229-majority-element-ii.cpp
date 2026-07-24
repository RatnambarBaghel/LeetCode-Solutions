class Solution {
public:
    vector<int> majorityElement(vector<int>& nums) {
        int n = nums.size();
        vector<int> ans;
        unordered_map<int,int> map;
        for(int x: nums){
            map[x]++;
        }
        set<int> uniNum(nums.begin(),nums.end());
        for(int x: uniNum){
            if(map[x] > n/3){
                ans.push_back(x);
            }
        }
        return ans;
    }
};