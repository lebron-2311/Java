package exercise20240121;


import java.util.PriorityQueue;

public class test2 {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(10);
        priorityQueue.offer(4);
        priorityQueue.offer(8);
        priorityQueue.offer(3);

        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.peek());
    }
}
