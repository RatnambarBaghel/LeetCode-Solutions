class Solution {
public:
    bool validDigit(int n, int x) {
        int temp =0;
        bool last = false;
        while(n > 0){
            int rem = n % 10;
            if(rem == x){
                last = true;
            }
            n /= 10;
            if(n == 0){
                if(rem == x){
                    return false;
                }
            }
        }
        return last;
    }
};