class Solution {
public:
    void sortColors(vector<int>& nums) {
        int i =0;
        int zero = 0;
        int two = nums.size()-1;
        while(i<=two){
            if(nums[i] == 0){
                int temp = nums[zero];
                nums[zero] = nums[i];
                nums[i] = temp;
                zero++;
                i++;
            }
            else if(nums[i] == 2){
                int temp = nums[two];
                nums[two] = nums[i];
                nums[i] = temp;
                two--;
            }
            else i++;
        }
        return;
    }
};