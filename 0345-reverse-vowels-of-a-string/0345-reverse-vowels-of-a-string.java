class Solution {
    public static boolean isVowel(char c){
        char lower = Character.toLowerCase(c);
        if (lower=='a'||lower=='e'||lower=='i'||lower=='o'||lower=='u'){
            return true;
        }
        return false;
    }
    public String reverseVowels(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder(s);
        int l = 0, r = n-1;
        while(l < r){
            if(isVowel(sb.charAt(l)) && isVowel(sb.charAt(r))){
                char ch = sb.charAt(l);
                sb.setCharAt(l,sb.charAt(r));
                sb.setCharAt(r,ch);
                l++;
                r--;
            }
            if(!isVowel(sb.charAt(l))) l++;
            if(!isVowel(sb.charAt(r))) r--;
        }
        return sb.toString();
    }
}