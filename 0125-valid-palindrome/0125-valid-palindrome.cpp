class Solution {
public:
    string reverseString(string s){
        int n = s.size();
        for(int i=0;i<n;i++){
            if(s[i] >='A' && s[i] <= 'Z'){
                s[i] = s[i] + 32;
            }
        }
        string ans;
        for(int i=0;i<n;i++){
            if((s[i] >='a' && s[i] <='z') || (s[i] >='0' && s[i]<='9')){
                ans += s[i];
            }
        }
        return ans;
    }
    bool isPalindrome(string s) {
        if(s.size() ==0) return true;
        string ans = reverseString(s);
        int l=0,r=ans.size()-1;
        while(l<r){
            if(ans[l] != ans[r]) return false;
            l++;
            r--;
        }
        return true;
    }
};