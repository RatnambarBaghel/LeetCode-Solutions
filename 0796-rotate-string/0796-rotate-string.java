class Solution {
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<n;i++){
            char temp = sb.charAt(0);
            for(int j=1;j<n;j++){
                sb.setCharAt(j-1, sb.charAt(j));
            }
            sb.setCharAt(n-1,temp);
            if(sb.toString().equals(goal)) return true;
        }
        return false;
    }
}