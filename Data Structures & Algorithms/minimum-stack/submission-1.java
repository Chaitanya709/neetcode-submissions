class MinStack {

    private Stack<Integer> stack;
    Stack<Integer> s = new Stack<>();
    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);

        int min = s.isEmpty() ? val : Math.min(val,s.peek());
        s.push(min);
    }
    
    public void pop() {
        stack.pop();
        s.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {

        return s.peek();
    }
}
