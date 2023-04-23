import java.util.PriorityQueue;

public class PriorityQueueQueue {
    public static void main(String[] args) {
        // Create a PriorityQueue object
        PriorityQueue<Object> pq = new PriorityQueue<>();

        // Add two elements to the priority queue using the add() method
        pq.add(0);
        pq.add(1);

        // Print the elements in the priority queue
        System.out.println("Elements in priority queue: " + pq);
    }
}
