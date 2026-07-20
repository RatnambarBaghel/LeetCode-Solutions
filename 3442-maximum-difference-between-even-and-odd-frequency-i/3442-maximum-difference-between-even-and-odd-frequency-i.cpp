class Solution {
public:
    int maxDifference(string s) {
        unordered_map<int,int> map;
        for(char &ch:s){
            map[ch]++;
        }
        vector<int> odd,even;
        for(char &ch:s){
            if(map[ch]%2 == 0){
                even.push_back(map[ch]);
            }
            else{
                odd.push_back(map[ch]);
            }
        }
        vector<int> ans;
        int maxi =INT_MIN;
        for(int i=0;i<odd.size();i++){
            for(int j=0;j<even.size();j++){
                int sum =odd[i] - even[j];
                maxi = max(maxi,sum);
            }
        }
        return maxi;
    }
};