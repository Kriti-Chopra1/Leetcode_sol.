class MyStack {
Queue<Integer> sq1;
Queue<Integer> sq2;

    public MyStack() {
        sq1 = new LinkedList<>();
        sq2 = new LinkedList<>();
    }
    
    public void push(int x) {
        sq2.offer(x);
        while(!sq1.isEmpty()) {
            sq2.offer(sq1.poll());
        }
        Queue<Integer> temp = sq1;
        sq1 = sq2;
        sq2 = temp;
    }
    
    public int pop() {
       return sq1.poll();
    }
    
    public int top() {
        return sq1.peek();
    }
    
    public boolean empty() {
        return sq1.isEmpty();
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