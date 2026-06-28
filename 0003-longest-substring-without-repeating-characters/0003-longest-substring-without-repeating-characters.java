class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashMap<Character,Integer> mpp = new HashMap<>();
        int l =0,r=0;
        char ch;
        int ans =0;
        while(r < n){
            ch = s.charAt(r);
            if (mpp.containsKey(ch)) {
                l = Math.max(l, mpp.get(ch) + 1);
            }

            mpp.put(ch, r);

            ans = Math.max(ans, r - l + 1);
            r++;
        }
        return ans;
    }
}