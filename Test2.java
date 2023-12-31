package Stack;

public class Test2 {
    public static void main(String[] args) {
        QueenToStack queenToStack=new QueenToStack();
        queenToStack.push(1);
        queenToStack.push(2);
        System.out.println(queenToStack.top());
        System.out.println(queenToStack.empty());
        queenToStack.pop();
        queenToStack.pop();
        System.out.println(queenToStack.empty());
        Solution solution=new Solution();
        String[] tokens = {"2", "1", "+", "3", "*"};
        int result = solution.evalRPN(tokens);
        System.out.println("Result: " + result);
        System.out.println("-------------------------------------------------------");
        StackToQueue stackToQueue=new StackToQueue();
        stackToQueue.push(1);
        stackToQueue.push(2);
        stackToQueue.push(3);
        stackToQueue.pop();
        System.out.println(stackToQueue.peek());//2
    }
}
