public class MovingAverage {
    private int size;
    private int sum;
    private Queue<Integer> queue;
    public MovingAverage(int size){
        this.size = size;
        this.sum = 0;
        this.queue = new LinkedList<Integer>();
    }
    public double next(int val){
        if(queue.size()==size){
            sum-=queue.poll();
        }
        queue.offer(val);
        sum+=val;
        return (double)sum/queue.size();
    }
    
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */
 
 