class Solution {
public:
    vector<bool> kidsWithCandies(vector<int>& candies, int extraCandies) {
        vector<bool> ans;
        int n = candies.size();
        for(int i=0;i<n;i++){
            int curr = candies[i] + extraCandies;
            bool asume = false;
            for(int j =0;j<n;j++){
                if(i == j) continue;
                if(curr < candies[j]){
                    asume = false;
                    break;
                }
                else asume = true;
            }
            ans.push_back(asume);
        }
        return ans;
    }
};