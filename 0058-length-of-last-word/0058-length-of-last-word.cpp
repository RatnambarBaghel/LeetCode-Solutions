class Solution {
public:
    int lengthOfLastWord(string s) {
        int n = s.size();
        int r=n-1;
        while(r>=0){
            if(s[r] != ' '){
                break;
            }
            r--;
        }
        int l=r;
        while(r>=0){
            if(s[r] == ' '){
                return l-r;
            }
            r--;
        }
        return l-r;
    }
};