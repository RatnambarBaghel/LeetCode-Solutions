class Solution {
public:
    int finalValueAfterOperations(vector<string>& ops) {
        int n = ops.size();
        int X = 0;
        for(int i=0;i<n;i++){
            if(ops[i] == "--X") --X;
            else if(ops[i] == "++X") ++X;
            else if(ops[i] == "X--") X--;
            else if(ops[i] == "X++") X++;
        }
        return X;

    }
};