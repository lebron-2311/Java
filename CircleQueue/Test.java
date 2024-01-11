package CircleQueue;

public class Test {
    public static void main(String[] args) {
        MyCircularQueue myCircularQueue=new MyCircularQueue(5);
        myCircularQueue.enQueue(1);
        myCircularQueue.enQueue(2);
        myCircularQueue.enQueue(3);
        System.out.println(myCircularQueue.Front());
        System.out.println(myCircularQueue.Rear());
        myCircularQueue.enQueue(4);
        myCircularQueue.deQueue(1);
        System.out.println(myCircularQueue.isFull());
        System.out.println(myCircularQueue.isEmpty());

    }
}
