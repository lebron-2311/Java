package Stack;

import java.util.LinkedList;
import java.util.Queue;

public class QueenToStack {

    private Queue<Integer> qu1;
    private Queue<Integer> qu2;

    public QueenToStack() {
       qu1=new LinkedList<>();
       qu2=new LinkedList<>();
    }
    public void push(int val){
        if(empty()){
            qu1.offer(val);
            return;
        }
        if(!qu1.isEmpty()){
            qu1.offer(val);
        }else {
            qu2.offer(val);
        }
    }
    public int pop(){
        if(empty()){
            return -1;
        }
        if(!qu1.isEmpty()){
            int size= qu1.size();
            for (int i=0;i<size-1;i++){
                qu2.offer(qu1.poll());
            }return qu1.poll();
        }
            else{
                int size=qu2.size();
                for(int i=0;i<size-1;i++){
                    qu1.offer(qu2.poll());
                }
                return qu2.poll();

        }
    }

    public int top(){
        if(empty()){
            return -1;
        }
        if(!qu1.isEmpty()){
            int size=qu1.size();
            int tmp=-1;
            for(int i=0;i<size;i++){
                tmp=qu1.poll();
                qu2.offer(tmp);
            }
            return tmp;
        }
        else {
            int size=qu2.size();
            int tmp=-1;
            for(int i=0;i<size;i++){
                tmp=qu2.poll();
                qu1.offer(tmp);
            }
            return tmp;
        }
    }

    public boolean empty(){
        return  qu1.isEmpty() && qu2.isEmpty();
    }
}
