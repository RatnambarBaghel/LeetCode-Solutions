class Solution {
    boolean isValid(String s, int l, int r){
        while(l < r){
            if(s.charAt(l) == s.charAt(r)){
                l++;
                r--;
            }
            else return false;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int l = 0;
        int r = s.length() -1;
        while(l < r){
            if(s.charAt(l) != s.charAt(r)){
                return (isValid(s,l,r-1) || isValid(s,l+1,r));
            }
            l++;
            r--;
        }
        return true;
    }
}