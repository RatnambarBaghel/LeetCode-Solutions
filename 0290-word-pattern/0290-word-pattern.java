class Solution {
    public boolean wordPattern(String pattern, String s) {
        int n = pattern.length();
        String[] words = s.split(" ");
        int m = words.length;
        if(n != m) return false;
        HashMap<Character, String> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(!map.containsKey(pattern.charAt(i))){
                if(map.containsValue(words[i])) return false;
                map.put(pattern.charAt(i), words[i]);
            }
            else{
                if(!map.get(pattern.charAt(i)).equals(words[i])) return false;
            }
        }
        return true;
    }
}