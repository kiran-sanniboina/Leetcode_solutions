class MinStack {
    Stack<Integer> s1,minstack;
    public MinStack() {
        s1 = new Stack<>();
        minstack = new Stack<>();
    }
    
    public void push(int value) {
        s1.push(value);
        if(minstack.isEmpty() || value<=minstack.peek()){
            minstack.push(value);
        }
    }
    
    public void pop() {
        if(s1.peek().equals(minstack.peek())){
            minstack.pop();
        }
        s1.pop();
    }
    
    public int top() {
        return s1.peek();
    }
    
    public int getMin() {
        return minstack.peek();
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