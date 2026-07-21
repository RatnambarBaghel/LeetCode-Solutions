class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int start =0,move =0;
        while(move < n){
            char curr = chars[move];
            int count = 0;
            
            while(move < n && chars[move] == curr){
                move++;
                count++;
            }

            chars[start++] = curr;

            if(count > 1){
                String temp = Integer.toString(count);
                for(char c: temp.toCharArray()){
                    chars[start++] = c;
                }
            }
        }
        return start;
    }
}