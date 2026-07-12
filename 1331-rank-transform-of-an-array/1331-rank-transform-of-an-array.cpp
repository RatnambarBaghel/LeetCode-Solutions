class Solution {
public:
    vector<int> arrayRankTransform(vector<int>& arr) {
        int n = arr.size();
        set<int> s(arr.begin(), arr.end());
        int rank =1;
        unordered_map<int,int> map;
        vector<int> ans(n);
        for(int x : s){
            if(map.find(x) == map.end()){
                map[x] = rank++;
            }
        }
        for(int i=0;i<n;i++){
            ans[i] = map[arr[i]];
        }
        return ans;
    }
};