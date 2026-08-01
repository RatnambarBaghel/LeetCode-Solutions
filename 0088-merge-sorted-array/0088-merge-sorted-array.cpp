class Solution {
public:
    void sortArr(vector<int> &arr){
        int n = arr.size();
        for(int i=0;i<n-1;i++){
            int j =i+1;
            while(j < n){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    j++;
                }else{
                    j++;
                }
            }
        }
    }
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int size = m+n;
        int i =0;
        while(m <= size && i < n){
            nums1[m] = nums2[i];
            i++;
            m++;
        }
        return sortArr(nums1);
    }
};