class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int l =0,r = 0;
        int ans =0;
        HashMap<Character, Integer> map = new HashMap<>();
        while(r<n){
            char ch = s.charAt(r);
            map.put(ch,map.getOrDefault(ch,0)+1);
            int windowSize = r - l + 1;
            int maxFreq = 0;

            for (int freq : map.values()) {
                maxFreq = Math.max(maxFreq, freq);
            }
            int max = windowSize - maxFreq;
            if(max > k){
                int fre = map.get(s.charAt(l));
                fre--;
                if(fre ==0) map.remove(s.charAt(l));
                else map.put(s.charAt(l),fre);
                l++;
            }
            else{
                ans = Math.max(ans,windowSize);
            }
            r++;
        }
        return ans;
    }
}