class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> st = new Stack<>();
        for(String op: ops){
            if(op.equals("C")){
                st.pop();
            }
            else if(op.equals("D")){
                st.push(2* st.peek());
            }
            else if(op.equals("+")){
                int a = st.pop();
                int b = st.peek();
                st.push(a);
                st.push(a+b);
            }
            else{
                st.push(Integer.parseInt(op));
            }
        }
        int sum =0;
        while(!st.isEmpty()){
            sum += st.peek();
            st.pop();
        }
        return sum;
    }
}