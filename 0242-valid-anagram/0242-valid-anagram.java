class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> mapS = new HashMap<>(),mapT = new HashMap<>();
        int n = s.length();
        int m = t.length();
        if(n != m) return false;
        for(int i=0;i<n;i++){
            mapS.put(s.charAt(i),mapS.getOrDefault(s.charAt(i),0)+1);
            mapT.put(t.charAt(i),mapT.getOrDefault(t.charAt(i),0)+1);
        }
        if(mapS.equals(mapT)) return true;
        return false;
    }
}