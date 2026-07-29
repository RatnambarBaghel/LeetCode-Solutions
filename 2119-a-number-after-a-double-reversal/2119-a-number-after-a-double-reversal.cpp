class Solution {
public:
    bool isSameAfterReversals(int num) {
        int n = num;
        int sum =0;
        while(n > 0){
            int rem = n % 10;
            sum = sum * 10 + rem;
            n /= 10;
        }
        int temp =0;
        while(sum >0){
            int rem = sum % 10;
            temp = temp * 10 + rem;
            sum /= 10;
        }
        if(temp == num) return true;
        else return false;
        
    }
};