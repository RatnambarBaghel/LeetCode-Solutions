class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n = s.length();
        int m = p.length();
        
        int[] f1 = new int[26];
        int[] f2 = new int[26];
        List<Integer> ans = new ArrayList<>();

        for(int i=0;i<m;i++){
            f2[p.charAt(i) - 'a']++;
        }
        int i=0,j=0;
        while(j < n){
            f1[s.charAt(j) - 'a']++;
            if(j-i+1 >m){
                f1[s.charAt(i) -'a']--;
                i++;
            }
            if(Arrays.equals(f1,f2)){
                ans.add(i);
            }
            j++;
        }
        return ans;
        
    }
}