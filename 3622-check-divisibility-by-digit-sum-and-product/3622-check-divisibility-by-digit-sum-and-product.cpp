class Solution {
public:
    bool checkDivisibility(int n) {
        int prod =1;
        int sum = 0;
        int temp = n;
        while(temp > 0){
            int rem = temp % 10;
            sum += rem;
            prod *= rem;

            temp /= 10;
        }

        int total = sum + prod;
        if(n % total == 0){
            return true;
        }else{
            return false;
        }
    }
};