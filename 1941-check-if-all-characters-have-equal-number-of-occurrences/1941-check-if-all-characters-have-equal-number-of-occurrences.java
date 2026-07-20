class Solution {
    public boolean areOccurrencesEqual(String s) {
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int ans =map.get(s.charAt(0));
        for(int i=0;i<n;i++){
            if(map.get(s.charAt(i)) != ans){
                return false;
            }
        }
        return true;
        
    }
}