class Solution {
public:
    int longestBeautifulSubstring(string word) {
        int n = word.size();
        vector<char> vowels = {'a', 'e', 'i', 'o', 'u'};
        int r =0;
        int ans =0;
        int temp =0;
        if(n < 5) return ans;
        for(int i=0;i<n;i++){
            char ch = word[i];
            if(ch == vowels[r]){
                ans++;
                if(r == 4){
                    temp = max(temp, ans);
                }
            }
            else if(r+1 < vowels.size() && ch == vowels[r+1]){
                if(i > 0 && word[i-1] == vowels[r]){
                    ans++;
                    r++;
                }
                if(r == 4){
                    temp = max(temp,ans);
                }
            }
            else{
                ans =0;
                r =0;
                if(ch == 'a'){
                    ans++;
                }
            }
        }
        if(temp < 5) return 0;
        else return temp;
    }
};