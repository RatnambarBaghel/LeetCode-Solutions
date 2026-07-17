class Solution {
public:
    int calPoints(vector<string>& ops) {
        vector<int> ans;
        for(string op: ops){
            if(op == "C"){
                ans.pop_back();
            }
            else if(op == "D"){
                ans.push_back(2* ans.back());
            }
            else if(op == "+"){
                int n = ans.size();
                ans.push_back(ans[n-1]+ ans[n-2]);
            }
            else{
                ans.push_back(stoi(op));
            }
        }
        int sum =0;
        for(int i: ans){
            sum += i;
        }
        return sum;
    }
};