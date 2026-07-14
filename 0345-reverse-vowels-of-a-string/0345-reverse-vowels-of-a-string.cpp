class Solution {
public:
    bool isVowel(char c) {
    char lower = tolower(c);
    if (lower=='a'||lower=='e'||lower=='i'||lower=='o'||lower=='u'){
        return true;
    }
    return false;
    }
    string reverseVowels(string s) {
        int n = s.size();
        int l = 0,r = n-1;
        while(l < r){
            if(isVowel(s[l]) && isVowel(s[r])){
                char ch = s[l];
                s[l] = s[r];
                s[r] = ch;
                l++;
                r--;
            }
            if(!isVowel(s[l])){
                l++;
            }
            if(!isVowel(s[r])){
                r--;
            }
        }
        return s;
        
    }
};