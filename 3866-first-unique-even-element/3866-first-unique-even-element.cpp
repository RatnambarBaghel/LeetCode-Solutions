class Solution {
public:
    int firstUniqueEven(vector<int>& nums) {
        unordered_map<int,int> map;
        for(int x: nums){
            map[x]++;
        }
        for(int x: nums){
            if(x%2 == 0 && map[x] == 1){
                return x;
            }
        }
        return -1;
    }
};