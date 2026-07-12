class Solution {
public:
    vector<int> arrayRankTransform(vector<int>& arr) {
        int n = arr.size();
        vector<int> sortArr = arr;
        map<int,int> map;
        sort(sortArr.begin(), sortArr.end());
        int rank =1;
        vector<int> ans(n);
        for(int i=0;i<n;i++){
            if(i > 0 && sortArr[i] > sortArr[i-1]){
                rank +=1;
            }
            map[sortArr[i]] = rank;
        }
        for(int i =0;i<n;i++){
            ans[i] = map[arr[i]];
        }
        return ans;
    }
};