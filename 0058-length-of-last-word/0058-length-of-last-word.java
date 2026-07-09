class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        int r = n-1;
        while(r>=0){
            if(s.charAt(r) != ' '){
                break;
            }
            r--;
        }
        int l=r;
        while(r>=0){
            if(s.charAt(r) == ' '){
                return l-r;
            }
            r--;
        }
        return l-r;
    }
}