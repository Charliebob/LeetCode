public class MedianFinder {

    // Adds a number into the data structure.
    private Queue<Integer> maxHeap = new PriorityQueue(new Comparator<Integer>(){
        @Override
            public int compare(Integer l1, Integer l2){
                return l2-l1;
            }
    }); //maxHeap
    private Queue<Integer> minHeap = new PriorityQueue(); //minHeap

    public void addNum(int num) {
        minHeap.add(num);
        maxHeap.add(minHeap.poll());
        if (minHeap.size() < maxHeap.size())
            minHeap.add(maxHeap.poll());
    }

    public double findMedian() {
        return minHeap.size() > maxHeap.size()
               ? minHeap.peek()
               : (minHeap.peek() + maxHeap.peek()) / 2.0;
    }
};

// Your MedianFinder object will be instantiated and called as such:
// MedianFinder mf = new MedianFinder();
// mf.addNum(1);
// mf.findMedian();