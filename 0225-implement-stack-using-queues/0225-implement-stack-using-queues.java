class MyStack {
    Queue<Integer> q = new LinkedList<>();
    public MyStack() {
        return;
    }
    
    public void push(int x) {
        q.offer(x);
        for (int i = 0; i < q.size() - 1; i++) {
            q.offer(q.poll());
        }
    }
    
    public int pop() {
        int x = q.poll();
        return x;
    }
    
    public int top() {
        int y = q.peek();
        return y;
    }
    
    public boolean empty() {
        return q.isEmpty()? true : false;
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