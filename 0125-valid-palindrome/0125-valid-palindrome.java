class Solution {
    String reverseStr(String s){
        int n = s.length();
        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<n;i++){
            char ch = sb.charAt(i);
            if(ch >='A' && ch <= 'Z'){
                ch = (char)(ch+32);
                sb.setCharAt(i,ch);
            }
        }
        String ans = "";
        for(int i=0;i<n;i++){
            if((sb.charAt(i) >='a' && sb.charAt(i) <='z') || (sb.charAt(i) >='0' && sb.charAt(i)<='9')){
                ans += sb.charAt(i);
            }
        }
        return ans;
    }
    public boolean isPalindrome(String s) {
        if(s.length() ==0) return true;
        String ans = reverseStr(s);
        int l=0,r=ans.length()-1;
        while(l<r){
            if(ans.charAt(l) != ans.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}