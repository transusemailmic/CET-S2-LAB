import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class Prog21 {
    public static void main(String args[]){
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        minHeap.add(2);
        minHeap.add(0);
        minHeap.add(1);
        minHeap.add(8);
        minHeap.add(6);

        maxHeap.add(2);
        maxHeap.add(0);
        maxHeap.add(1);
        maxHeap.add(8);
        maxHeap.add(6);

        System.out.println("Top of minHeap: "+minHeap.peek());
        System.out.println("Top of maxHeap: "+maxHeap.peek());

        System.out.println("Removing from minHeap: "+minHeap.poll());
        System.out.println("Removing from maxHeap: "+maxHeap.poll());

        System.out.println("New top of minHeap: "+minHeap.peek());
        System.out.println("New top of maxHeap: "+maxHeap.peek());
    }
}
