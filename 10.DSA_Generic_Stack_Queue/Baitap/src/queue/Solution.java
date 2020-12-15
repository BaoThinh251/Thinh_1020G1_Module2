package queue;

public class Solution{
    public static class Node {
        int data;
        Node link;
    }
    public static class Queue {
        Node front, rear;
    }
    public static void enQueue(Queue queue, int value){
        Node temp = new Node();
        temp.data = value;
        if(queue.front == null){
            queue.front = temp;
        } else {
            queue.rear.link = temp;
        }
        queue.rear = temp;
        queue.rear.link = queue.front;
    }
    public static int dequeue(Queue queue){
        if(queue.front == null){
            System.out.println("Queue is empty!");
            return Integer.MIN_VALUE;
        }
        int value;
        if (queue.front == queue.rear) {
            value = queue.front.data;
            queue.front =  null;
            queue.rear =  null;
        } else {
            Node  temp = queue.front;
            value = temp.data;
            queue.front = queue.front .link;
            queue.rear.link= queue.front;
        }
        return value;
    }
    public static void displayQueue(Queue queue){
        Node  temp = queue.front;
        System.out.print("Elements in Circular Queue are: ");
        while (temp .link != queue.front)
        {
            System.out.print(temp .data + "\t");
            temp = temp .link;
        }
        System.out.print(temp .data + "\t");
    }
}
