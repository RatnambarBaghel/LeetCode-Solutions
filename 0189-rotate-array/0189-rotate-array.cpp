class Solution {
public:
    void reverseArray(vector<int>& nums,int start,int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end-1];
            nums[end-1] = temp;
            start++;
            end--;
        }
        return;
    }
    void rotate(vector<int>& nums, int k) {
        int n = nums.size();
        k = k % n;
        //reverse k elements 
        reverseArray(nums,n-k,n);

        // Reverse n-k elements
        reverseArray(nums,0,n-k);

        // Reverse whole array
        reverseArray(nums,0,n);

        return;
    }
};