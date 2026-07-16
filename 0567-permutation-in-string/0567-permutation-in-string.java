class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        int[] f1 = new int[26];
        int[] f2 = new int[26];

        for(int i=0;i<n;i++){
            f1[s1.charAt(i) -'a']++;
        }

        int i =0,j=0;
        while(j < m){
            f2[s2.charAt(j) - 'a']++;
            if(j-i+1 > n){
                f2[s2.charAt(i) -'a']--;
                i++;
            }
            if(Arrays.equals(f1,f2)){
                return true;
            }
            j++;
        }
        return false;
    }
}