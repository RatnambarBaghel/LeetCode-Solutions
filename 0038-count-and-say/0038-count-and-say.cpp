class Solution {
public:
    string countAndSay(int n) {
        if(n==1){
            return "1";
        }

        string say = countAndSay(n-1);

        string ans="";
        
        int len = say.size();

        for(int i=0;i<len;i++){
            char ch = say[i];

            int cnt =1;

            while(i < len-1 && say[i] == say[i+1]){
                cnt++;
                i++;
            }

            ans += to_string(cnt);
            ans += ch;
        }
        return ans;
    }
};