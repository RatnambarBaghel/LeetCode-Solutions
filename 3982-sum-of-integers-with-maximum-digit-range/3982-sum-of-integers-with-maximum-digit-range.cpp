class Solution {
public:
    int maxDigitRange(vector<int>& nums) {
        int maxRange = -1;
        int ans =0;
        for(int num: nums){
            int temp = num;
            int maxi = 0;
            int mini = 9;

            if(temp ==0){
                maxi = mini = 0;
            }
            else{
                while(temp !=0){
                    int rem = temp %10;
                    maxi = max(maxi,rem);
                    mini = min(mini,rem);
                    temp /=10;
                }
            }
            int range = maxi - mini;

            if(range > maxRange){
                maxRange = range;
                ans = num;
            }
            else if(range == maxRange){
                ans += num;
            }
        }
        return ans;
    }
};