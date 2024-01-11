package CircleQueue;

public class MyCircularQueue {


    public int[] elem;
    public int front;
    public int rear;

    public MyCircularQueue(int k) {
         elem=new int[k];
    }

    public boolean enQueue(int val){
        if(isFull()){
            return  false;
        }
        elem[rear]=val;
        rear=(rear+1)% elem.length;
        return true;
    }

    public boolean deQueue(int val){
        if(isEmpty()){
            return false;
        }
        front=(front+1)%elem.length;
        return true;
    }

    public int  Front(){
        if(isEmpty()){
            return -1;
        }
        return elem[front];
    }

    public int Rear(){
        if(isEmpty()){
            return -1;
        }
        int index=(rear==0)?elem.length-1:rear-1;
        return elem[index];
    }


    public boolean isEmpty(){
        return rear==front;
    }


    public boolean isFull(){
            return (rear+1)% elem.length==front;
        }


}
