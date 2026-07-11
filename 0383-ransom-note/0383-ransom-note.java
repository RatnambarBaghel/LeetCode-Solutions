class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int n = ransomNote.length();
        int m = magazine.length();
        HashMap<Character, Integer> map1 = new HashMap<>();
        for(int i =0;i<n;i++){
            map1.put(ransomNote.charAt(i),map1.getOrDefault(ransomNote.charAt(i),0)+1);
        }
        for(int i=0;i<m;i++){
            if(map1.containsKey(magazine.charAt(i))){
                int value = map1.get(magazine.charAt(i)) -1;
                if(value == 0){
                    map1.remove(magazine.charAt(i));
                }
                else{
                    map1.put(magazine.charAt(i),value);
                }
            }
        }
        if(map1.isEmpty()) return true;
        return false;
    }
}