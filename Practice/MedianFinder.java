import java.util.*;

public class MedianFinder {
    private PriorityQueue<Integer> low;  // Max-heap
    private PriorityQueue<Integer> high; // Min-heap

    public MedianFinder() {
        // Max heap (reverse order)
        low = new PriorityQueue<>(Collections.reverseOrder());
        // Min heap (natural order)
        high = new PriorityQueue<>();
    }

    public void addNum(int num) {
        // Add to max heap
        low.offer(num);
        // Balance: largest of low goes to high
        high.offer(low.poll());

        // Maintain size invariant: low can be bigger by at most 1
        if (low.size() < high.size()) {
            low.offer(high.poll());
        }
    }

    public double findMedian() {
        if (low.size() == high.size()) {
            return (low.peek() + high.peek()) / 2.0;
        } else {
            return low.peek();
        }
    }

     public static void main(String[] args) {
        MedianFinder mf = new MedianFinder();
        mf.addNum(1);
        mf.addNum(2);
        System.out.println(mf.findMedian()); // 1.5
        mf.addNum(3);
        System.out.println(mf.findMedian()); // 2.0
    }
}
