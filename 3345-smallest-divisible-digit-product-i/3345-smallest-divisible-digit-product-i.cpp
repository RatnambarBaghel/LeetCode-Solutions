class Solution {
public:
    int smallestNumber(int n, int t) {
        
        while(n){
            int prod =1;
            int temp = n;
            while(temp !=0){
                int rem = temp % 10;
                prod = prod * rem;
                temp /= 10;
            }
            if(prod % t == 0){
                return n;
            }
            n++;
        }
        return n;
    }
};