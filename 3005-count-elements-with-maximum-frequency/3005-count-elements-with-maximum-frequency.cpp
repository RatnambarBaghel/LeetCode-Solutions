class Solution {
public:
    int maxFrequencyElements(vector<int>& nums) {
        int ans =0;
        unordered_map<int,int> map;
        int maxi =0;
        for(int x: nums){
            map[x]++;
            maxi = max(maxi,map[x]);
        }
        set<int> uni(nums.begin(),nums.end());
        for(int x: uni){
            if(map[x] == maxi){
                ans += map[x];
            }
        }
        return ans;
    }
};