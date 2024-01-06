package Stack;

import java.util.LinkedList;
import java.util.Stack;

public class StackToQueue {
    private Stack<Integer> s1;
    private Stack<Integer> s2;
    public StackToQueue() {
        s1=new Stack<>();
        s2=new Stack<>();
    }

    public void push(int val) {
        s1.push(val);
    }

    public int pop() {
       if(empty()){
           return -1;
       }
       if(s2.isEmpty()){
           while (!s1.isEmpty()){
               s2.push(s1.pop());
           }
       }

        return s2.pop();
    }

    public int peek() {
        if(empty()){
            return -1;
        }
        if(s2.isEmpty()){
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }

        return s2.peek();
    }

    public boolean empty() {
       return s1.isEmpty() && s2.isEmpty();
    }
}
