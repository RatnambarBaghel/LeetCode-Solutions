class MyStack {
    Stack<Integer> st = new Stack<>();
    public MyStack() {
        return;
    }
    
    public void push(int x) {
        st.push(x);
    }
    
    public int pop() {
        int x = st.pop();
        return x;
    }
    
    public int top() {
        int y = st.peek();
        return y;
    }
    
    public boolean empty() {
        return st.isEmpty()? true : false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */