class MyQueue {
    // Push element x to the back of queue.
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    public void push(int x) {
        stack1.push(x);
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
    }

    // Removes the element from in front of queue.
    public void pop() {
        if(!stack2.isEmtpy()){
            stack2.pop();
        }
    }

    // Get the front element.
    public int peek() {
        return stack2.pop();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return stack1.isEmpty()&&stack2.isEmpty();
    }
}