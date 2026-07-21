class Solution {
    public String decodeString(String s) {
        Stack<Integer> counts = new Stack<>();
        Stack<String> result = new Stack<>();
        int num = 0;
        String curr = "";
        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                num = num * 10 +(c - '0');
            }
            else if(c == '['){
                counts.push(num);
                result.push(curr);
                num =0;
                curr ="";
            }
            else if(c == ']'){
                int repeat = counts.peek();
                counts.pop();
                String temp = result.peek();
                result.pop();
                while(repeat != 0){
                    temp += curr;
                    repeat--;
                }
                curr = temp;
            }
            else {
                curr += c;
            }
        }
        return curr;
    }
}