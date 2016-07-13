public class MovingAverage {

    private int size;
    private double sum;
    private ArrayDeque<Integer> queue;
    public MovingAverage(int size) {
        this.size = size;
        this.sum = 0;
        this.queue = new ArrayDeque<Integer>();
    }

    public double next(int val) {
        if (queue.size() == size) {
            sum -= queue.remove();
        }
        queue.offer(val);
        sum += val;
        return sum / queue.size();
    }
    
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */