class Solution {
public:
    vector<string> sortPeople(vector<string>& names, vector<int>& heights) {
        int n = heights.size();
        vector<int> copy = heights;  

        unordered_map<int,int> fre;
        sort(copy.begin(), copy.end(), greater<int>());

        for(int i=0;i<n;i++){
            fre[heights[i]] = i;
        }

        vector<string> ans(n);
        for(int i=0;i<n;i++){
            ans[i] = names[fre[copy[i]]];
        }
        return ans;

    }
};