class Solution {
public:
    string decodeString(string s) {
        stack<int> counts;
        stack<string> result;
        int num = 0;
        string ans ="";
        for(char ch: s){
            if(isdigit(ch)){
                num = num *10 +(ch -'0');
            }
            else if(ch == '['){
                counts.push(num);
                result.push(ans);
                num =0;
                ans ="";
            }
            else if(ch ==']'){
                int repeat = counts.top();
                counts.pop();
                string temp = result.top();
                result.pop();
                while(repeat--){
                    temp += ans;
                }
                ans = temp;
            }
            else{
                ans += ch;
            }
        }
        return ans;
    }
};