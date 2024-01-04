package Stack;

import ListExercise231220.EmptyException;

import java.util.Arrays;

public class MyStack {
    public int[] elem;
    public int usedSize;
    public static final int DEFAULT_CAPACITY=10;

    public MyStack() {
        this.elem = new int[DEFAULT_CAPACITY];
    }

    //压栈 入栈

    public void push(int val){
        if(isFull()){
            this.elem= Arrays.copyOf(elem,2*elem.length);
        }
        elem[usedSize]=val;
        usedSize++;
    }

    public boolean isFull(){
        return usedSize==elem.length;
    }
    public int pop(){
        if(isEmpty()){
            throw new EmptyException("栈为空...");
        }
        int oldVal=elem[usedSize-1];
        usedSize--;
        return oldVal;
    }

    public boolean isEmpty(){
        return usedSize==0;
    }
    public int peak(){
        if(isEmpty()){
            throw new EmptyException("栈为空...");
        }
        return elem[usedSize-1];
    }
}
