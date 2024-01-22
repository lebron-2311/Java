package exercise20240121;

public class Test {
    public static void main(String[] args) {
        TestHeap testHeap=new TestHeap();
        int []array={98,89,37,84,25,99,79,63,76};
        testHeap.initElem(array);
        testHeap.display();
        testHeap.createBigHeap();
        testHeap.display();
        testHeap.offer(100);
        testHeap.display();
        testHeap.poll();
        testHeap.display();
    }
}
