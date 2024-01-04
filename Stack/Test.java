package Stack;

public class Test {
    public static void main(String[] args) {
        MyStack myStack=new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        System.out.println(myStack.pop());
        System.out.println(myStack.peak());
        myStack.pop();
        System.out.println(myStack.peak());

        MinStack minStack=new MinStack();
        minStack.push(1);
        minStack.push(-1);
        System.out.println(minStack.getMin());
        minStack.push(3);
        minStack.push(-8);
        System.out.println(minStack.getMin());
        System.out.println(minStack.top());
    }
}
