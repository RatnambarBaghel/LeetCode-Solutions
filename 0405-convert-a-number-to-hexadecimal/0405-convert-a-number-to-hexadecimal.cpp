class Solution {
public:
    string toHex(int num) {
        if(num == 0) return "0";
        unsigned int n =num;
        string ans="";
        while(n != 0){
            int rem = n %16;
            if(rem < 10) 
                ans += (char)(rem + '0');   
            else 
                ans += (char)(rem - 10 + 'a');

            n /= 16;
        }

        reverse(ans.begin(), ans.end());
        return ans;
    }
};