package queue;

public class QueueClient {
    public static void main(String[] args) {
        Solution.Queue queue = new Solution.Queue();
        queue.front = queue.rear = null;
        Solution.enQueue(queue, 1);
        Solution.enQueue(queue, 2);
        Solution.enQueue(queue, 3);
        Solution.enQueue(queue, 4);
        Solution.enQueue(queue, 5);
        Solution.displayQueue(queue);
        Solution.dequeue(queue);
        Solution.dequeue(queue);
        Solution.dequeue(queue);
        Solution.enQueue(queue, 6);
        Solution.enQueue(queue, 7);
        Solution.enQueue(queue, 8);
        System.out.println();
        Solution.displayQueue(queue);
    }
}
