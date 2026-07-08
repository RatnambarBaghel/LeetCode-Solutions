class Solution {
public:
    char findTheDifference(string s, string t) {
        int tSum =0;
        int sSum = 0;
        for(int i=0;i<t.size();i++){
            tSum += t[i];
        }
        for(int i=0;i<s.size();i++){
            sSum += s[i];
        }
        char ans = (char)(tSum - sSum);
        return ans;
    }
};