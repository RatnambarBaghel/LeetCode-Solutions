class Solution {
public:
    bool isPalindrome(string s, int l, int r){
        while(l < r){
            if(s[l] == s[r]){
                l++;
                r--;
            }
            else return false;
        }
        return true;
    }
    bool validPalindrome(string s) {
        int n = s.size();
        int l = 0, r = n-1;
        while(l < r){
            if(s[l] != s[r]){
                return (isPalindrome(s, l,r-1) || isPalindrome(s, l+1, r));
            }
            l++;
            r--;
        }
        
       return true; 
    }
};