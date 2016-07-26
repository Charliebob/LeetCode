public class MedianFinder {

    // Adds a number into the data structure.
    private Queue<Long> small = new PriorityQueue(new Comparator<Long>(){
        @Override
            public int compare(Long l1, Long l2){
                return l2-l1;
            }
    }); //maxHeap
    private Queue<Long> large = new PriorityQueue(); //minHeap

    public void addNum(int num) {
        large.add((long) num);
        small.add(large.poll());
        if (large.size() < small.size())
            large.add(small.poll());
    }

    public double findMedian() {
        return large.size() > small.size()
               ? large.peek()
               : (large.peek() - small.peek()) / 2.0;
    }
};

// Your MedianFinder object will be instantiated and called as such:
// MedianFinder mf = new MedianFinder();
// mf.addNum(1);
// mf.findMedian();