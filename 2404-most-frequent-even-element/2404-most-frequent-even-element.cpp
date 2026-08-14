class Solution {
public:
    int mostFrequentEven(vector<int>& nums) {
        int n = nums.size();
        unordered_map<int,int> map;
        for(int x: nums){
            if(x % 2 == 0){
                map[x]++;
            }
        }
        if(map.empty()){
            return -1;
        }
        set<int> s(nums.begin(),nums.end());
        int best = -1;
        int maxCount = 0;

        for(auto &p : map){
            int val = p.first;
            int cnt = p.second;

            if(cnt > maxCount || (cnt == maxCount && val < best)){
                maxCount = cnt;
                best = val;
            }
        }

        return best;
    }
};