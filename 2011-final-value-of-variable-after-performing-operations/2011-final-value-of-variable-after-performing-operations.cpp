class Solution {
public:
    int finalValueAfterOperations(vector<string>& ops) {
        int x = 0;
        for (string op : ops) {
            if (op.contains("++")) x++;
            else x--;
        }
        return x;
    }
};