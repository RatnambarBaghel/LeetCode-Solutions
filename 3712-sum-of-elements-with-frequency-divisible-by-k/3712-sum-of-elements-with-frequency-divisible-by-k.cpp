class Solution {
public:
    int sumDivisibleByK(vector<int>& nums, int k) {
        unordered_map<int,int> map;
        int sum =0;
        for(int x : nums){
            map[x]++;
        }
        for(int x:nums){
            if(map[x]%k == 0){
                sum += x;
            }
        }
        return sum;
    }
};