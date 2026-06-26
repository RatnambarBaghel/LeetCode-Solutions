class MinStack {
    Stack<Integer> obj = new Stack<>();
    Stack<Integer> minSt = new Stack<>();
    public MinStack() {
        return;
    }
    
    public void push(int value) {
        obj.push(value);
        if (minSt.isEmpty() || value <= minSt.peek()){
            minSt.push(value);
        }
    }
    
    public void pop() {
        int x = obj.pop();
        if(x == minSt.peek()){
             minSt.pop();
        }
       
    }
    
    public int top() {
       int param = obj.peek();
       return param;
    }
    
    public int getMin() {
        int mini = minSt.peek();
        return mini;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */