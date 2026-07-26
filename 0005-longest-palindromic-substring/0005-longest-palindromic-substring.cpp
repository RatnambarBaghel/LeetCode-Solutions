class Solution {
public:
    string longestPalindrome(string s) {
        int n = s.size();
        int len =0;
        int startIdx =0;
        for(int i=0;i<n;i++){
            // odd
            int left = i;
            int right = i;
            while(left >= 0 && right < n && s[left] == s[right]){
                if(len < right-left+1){
                    startIdx = left;
                    len = right - left+1; 
                }
                left--;
                right++;
            }

            // even 
            left = i;
            right = i+1;
            while(left >= 0 && right < n && s[left] == s[right]){
                if(len < right-left +1){
                    startIdx = left;
                    len = right - left +1;
                }
                left--;
                right++;
            }
        }
        string ans;
        for(int i=startIdx;i<startIdx+len;i++){
            ans += s[i];
        }
        return ans;
    }
};