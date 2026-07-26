class Solution {
public:
    string convertToBase7(int num) {
        if(num == 0) return "0";
        bool neg = num < 0;
        num = abs(num);
        string ans;
        while(num >0){
            int rem = num % 7;
            ans = char('0' + rem) + ans;
            num /= 7;
        }
        return neg?"-" + ans : ans;
        
    }
};