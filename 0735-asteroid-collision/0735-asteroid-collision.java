class Solution {
    public int[] asteroidCollision(int[] arr) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i] > 0) st.push(arr[i]);
            else{
                int el = Math.abs(arr[i]);
                while(st.isEmpty() == false && st.peek() > 0){
                    if(el == st.peek()) {
                        st.pop();
                        el = 0;
                        break;
                    }
                    else if(el > st.peek()){
                        st.pop();
                    }
                    else{
                        el = 0;
                        break;
                    }
                }
                if(el != 0) st.push(arr[i]);
            }
        }
        int ans[] = new int[st.size()];
        while(!st.isEmpty()){
            ans[st.size()-1] = st.peek();
            st.pop();

        }
        return ans;
    }
}