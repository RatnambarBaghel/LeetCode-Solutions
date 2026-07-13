class Solution {
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