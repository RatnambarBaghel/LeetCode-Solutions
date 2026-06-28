class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashSet<Character> set = new HashSet<>();
        int l =0,r=0;
        char ch;
        int ans =0;
        while(r < n){
            ch = s.charAt(r);
            while(set.contains(ch)){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(ch);
            ans = Math.max(ans,r-l+1);
            r++;
        }
        return ans;
    }
}