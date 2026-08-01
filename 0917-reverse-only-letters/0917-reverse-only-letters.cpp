class Solution {
public:
    string reverseOnlyLetters(string s) {
        int n = s.size();
        int l=0,r=n-1;
        while(l < r){
            if(((s[l] >= 'a' && s[l] <= 'z') || (s[l] >= 'A' && s[l] <= 'Z')) && ((s[r] >= 'a' && s[r] <= 'z') || (s[r] >= 'A' && s[r] <= 'Z'))){
                char ch = s[l];
                s[l] = s[r];
                s[r] = ch;
                l++;
                r--;
            }
            else if(!((s[l] >= 'a' && s[l] <= 'z') || (s[l] >= 'A' && s[l] <= 'Z'))){
                l++;
            }else if(!((s[r] >= 'a' && s[r] <= 'z') || (s[r] >= 'A' && s[r] <= 'Z'))){
                r--;
            }
        }
        return s;
    }
};