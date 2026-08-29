class Solution {
    public String countAndSay(int n) {
        if(n ==1){
            return "1";
        }

        String say=countAndSay(n-1);

        int len = say.length();
        StringBuilder ans= new StringBuilder();

        for(int i=0;i<len;i++){
            char ch = say.charAt(i);

            int cnt =1;

            while(i < len-1 && say.charAt(i) == say.charAt(i+1)){
                cnt++;
                i++;
            }

            ans.append(cnt);
            ans.append(ch);
        }
        return ans.toString();
    }
}