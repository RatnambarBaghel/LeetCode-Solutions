class Solution {
public:
    void revArr(vector<int> &arr){
        int n = arr.size();
        int i =0,j=n-1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }
    void flip(vector<int> &arr){
        for(int& x: arr){
            if(x == 0){
                x = 1;
            }else{
                x = 0;
            }
        }

    }
    vector<vector<int>> flipAndInvertImage(vector<vector<int>>& image) {
        int n = image.size();
        for(auto& arr:image){
            revArr(arr);
        }
        for(auto& arr: image){
            flip(arr);
        }
        return image;
    }
};