class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int l = 0,r = 0;
        int cnt = 0;
        HashMap<Character,Integer> mpp = new HashMap<>();
        while(r<n){
            int fre = mpp.getOrDefault(s.charAt(r),0);
            mpp.put(s.charAt(r),fre+1);
            while(l<=r && mpp.size() >=3){
                cnt += n-r;
                fre = mpp.getOrDefault(s.charAt(l),0);
                fre--;
                if(fre == 0) mpp.remove(s.charAt(l));
                else mpp.put(s.charAt(l),fre);
                l++;
            }
            r++;
        }
        return cnt;
    }
}