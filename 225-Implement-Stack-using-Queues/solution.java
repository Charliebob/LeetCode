class MyStack {
    Queue<Integer> queue = new LinkedList<Integer>();
    // Push element x onto stack.
    public void push(int x) {
        queue.add(x);
        for(int i=1; i<queue.size(); i++){
            queue.add(queue.remove());
        }
    }

    // Removes the element on top of the stack.
    public void pop() {
        queue.remove();
    }

    // Get the top element.
    public int top() {
        return queue.peek();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return queue.isEmpty();
    }
}