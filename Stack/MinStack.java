package Stack;

import com.sun.source.tree.BreakTree;

import java.util.Stack;

public class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;
    public MinStack(){
        this.stack=new Stack<>();
        this.minStack=new Stack<>();
    }

    //放的是两个栈，一个是放普通元素，另一个是放最小值
    public void push(int val){
        stack.push(val);//普通栈
        if (minStack.empty()){//最小栈
            //最小栈是空的直接放就行
            minStack.push(val);
        }else {
            int peakNum=minStack.peek();
            if(val<=peakNum){
                //如果val比最上面的元素小就进栈
                minStack.push(val);
            }
        }
    }
    public void pop(){
        int val=stack.pop();
        if(val == minStack.peek()){
            minStack.pop();
        }
    }

    public int top(){
        return stack.peek();
    }

    public int getMin(){
        return minStack.peek();
    }
}
