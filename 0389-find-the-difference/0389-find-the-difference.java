class Solution {
    public char findTheDifference(String s, String t) {
        int n = t.length();
        int m = s.length();
        int tSum =0;
        int sSum =0;
        for(int i=0;i<n;i++){
            tSum += (int)t.charAt(i);
        }
        for(int j=0;j<m;j++){
            sSum += (int)s.charAt(j);
        }
        char ans = (char)(tSum-sSum);
        return ans;

    }
}