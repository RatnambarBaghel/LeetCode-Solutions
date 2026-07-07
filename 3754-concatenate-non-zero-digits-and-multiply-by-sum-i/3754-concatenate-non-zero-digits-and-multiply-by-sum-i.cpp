class Solution {
public:
    long long sumAndMultiply(int n) {
        long long sum =0;
        long long x =0;
        long long temp =0;
        while(n !=0){
            int rem = n%10;
            if(rem !=0){
                sum += rem;
                temp = temp *10 +rem;
            }
            n /= 10;
        }
        while(temp !=0){
            int rem = temp%10;
            x = x*10 +rem;
            temp /= 10;
        }
        return x*sum;
    }
};