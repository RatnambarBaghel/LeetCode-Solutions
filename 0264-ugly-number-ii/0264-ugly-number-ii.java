class Solution {
    public int nthUglyNumber(int n) {
        int ugly[] = new int[n];
        ugly[0] = 1;
        int p2 =0;
        int p3 =0;
        int p5 =0;
        int count =1;
        while (count < n){
            int a = ugly[p2] * 2;
            int b = ugly[p3] * 3;
            int c = ugly[p5] * 5;
            int minValue = Math.min(a,Math.min(b,c));
            if(a == minValue) p2++;
            if(b == minValue) p3++;
            if(c == minValue) p5++;
            ugly[count] = minValue;
            count++;
        }
        return ugly[n-1];
    }
    
}