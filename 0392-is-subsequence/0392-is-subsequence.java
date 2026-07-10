class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = s.length();
        int m = t.length();
        int sp=0,tp=0;
        while(sp <n && tp <m){
            if(s.charAt(sp) == t.charAt(tp)){
                sp++;
            }
            tp++;
        }
        return sp == n;
    }
}