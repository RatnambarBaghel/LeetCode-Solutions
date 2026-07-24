class Solution {
public:
    string toHex(int num) {
        if(num == 0) return "0";
        unsigned int n =num;
        string ans="";
        while(n != 0){
            int rem = n %16;
            if(rem == 10){
                ans +='a';
            }
            else if(rem == 11){
                ans += 'b';
            }
            else if(rem == 12){
                ans += 'c';
            }
            else if(rem == 13){
                ans += 'd';
            }
            else if(rem == 14){
                ans += 'e';
            }
            else if(rem == 15){
                ans += 'f';
            }
            else {
                ans += (char)(rem +'0');
            }

            n /= 16;
        }

        reverse(ans.begin(), ans.end());
        return ans;
    }
};