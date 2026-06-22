class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] next = new int[n];
        Stack<Integer> st = new Stack();
        for(int i =n-1;i>=0;i--){
            while(st.isEmpty() == false && st.peek() <= nums[i]){
                st.pop();
            }
            if(st.isEmpty() == true ) next[i] =-1;
            else next[i]=st.peek();
            st.push(nums[i]);
        }
        for(int i =n-1;i>=0;i--){
            while(st.isEmpty() == false && st.peek() <=  nums[i]){
                st.pop();
            }
            if(st.isEmpty() == true ) next[i]=-1;
            else next[i]=st.peek();
            st.push(nums[i]);
        }
        // Arrays.sort(next,reverse=true);
        return next;
    }
}