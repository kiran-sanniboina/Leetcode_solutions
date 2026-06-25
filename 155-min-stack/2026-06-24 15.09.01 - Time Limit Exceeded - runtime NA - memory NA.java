class MinStack {
    Stack<Integer> s1;
    public MinStack() {
        s1 = new Stack<>();
    }
    
    public void push(int value) {
        s1.push(value);
    }
    
    public void pop() {
        s1.pop();
    }
    
    public int top() {
        return s1.peek();
    }
    
    public int getMin() {
        Stack<Integer> s2 = new Stack<>();
        int min = Integer.MAX_VALUE;
        while(!s1.isEmpty()){
            s2.push(s1.pop());
            min=Math.min(min,s2.peek());
        }
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return min;
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