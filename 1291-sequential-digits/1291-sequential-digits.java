class Solution {
    int lastDigit(int low){
        int lastDigit = 0;
        int rem = 1;
        while(low !=0){
            rem = low %10;
            low /= 10;
        }
        return rem;
    }
    int count(int high){
        int count =0;
        while(high != 0){
            high /= 10;
            count++;
        }
        return count;
    }
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();
        int start = 1;
        int end = count(high);
        while(start <= 9){
            int rem = start;
            int sm = start + 1;   
            int i=0;
            while (i < end && sm <= 9) {
                rem = rem * 10 + sm;
                sm++;
                if (rem >= low && rem <= high) {
                    ans.add(rem);
                }
                i++;
            }
            start++;
        }
        Collections.sort(ans);
        return ans;
    }
}