class Solution {
public:
    int minimumDeletions(vector<int>& nums) {
        int n = nums.size();
        int mini=INT_MAX,maxi=INT_MIN;
        int minIndx=-1,maxIndx=-1;

        for(int i=0; i<n; i++){
            if(nums[i] > maxi){
                maxi = nums[i];
                maxIndx = i;
            }
            if(nums[i] < mini){
                mini = nums[i];
                minIndx = i;
            }
        }

        int lftDel = max(minIndx,maxIndx)+1;
        int rgtDel = n- min(minIndx,maxIndx);
        int bothDel = min(minIndx,maxIndx)+1 + n- max(minIndx,maxIndx);

        return min(lftDel,min(rgtDel,bothDel));
    }
};