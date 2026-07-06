class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int pos = 0;
        int n = nums.size();
        for(int i=1;i<n;i++){
            if(nums[pos] != nums[i]){
                nums[pos+1] = nums[i];
                pos++;
            }
        }
        return pos+1;
    }
};