class Solution {
public:
    int sumOfUnique(vector<int>& nums) {
        unordered_map<int,int> map;
        for(int x: nums){
            map[x]++;
        }
        int sum =0;
        for(int x:nums){
            if(map[x] == 1){
                sum += x;
            }
        }
        return sum;
    }
};