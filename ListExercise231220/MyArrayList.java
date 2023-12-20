package ListExercise231220;

import java.util.Arrays;

public class MyArrayList implements IList {
    public int[] elem;
    public int usedSize;
    public static final int DEFAULT_CAPACITY=5;

    public MyArrayList() {
        elem=new int[DEFAULT_CAPACITY];
    }

    @Override
    public void add(int data) {
       if(isFull()){
           elem= Arrays.copyOf(elem,2*elem.length);//如果是空的就扩容
       }
       elem[usedSize++]=data;

    }
    private void  checkPosOfAdd(int pos){
        if(pos<0||pos>usedSize){
            throw new PosException("pos位置为："+pos);
        }

    }

    @Override
    public void add(int pos, int data) {
           checkPosOfAdd(pos);
           if (isFull()){
               elem=Arrays.copyOf(elem,2*elem.length);
           }
           for(int i=usedSize-1;i>=pos;i--){
               elem[i+1]=elem[i];
           }
           elem[pos]=data;
           usedSize++;

    }

    @Override
    public boolean contains(int toFind) {
        //查找当前元素 是否存在
        for (int i=0;i<usedSize;i++)
        {
            if (elem[i]==toFind){
                return  true;
            }
        }
        return false;
    }

    @Override//查找当前元素 的下标
    public int indexOf(int toFind) {
        for (int i = 0; i < usedSize; i++) {
            if(elem[i] == toFind) {
                return i;
            }
        }
        return -1;
    }
    private void checkPosOfGet(int pos){
        if(pos<0||pos>=this.usedSize){
            throw new PosException("pos位置不合法："+pos);
        }
    }

    @Override
    public int get(int pos) {
        checkPosOfGet(pos);
        if(isEmpty()){
            throw new EmptyException("顺序表为空");
        }
        return elem[pos];
    }

    @Override
    public void set(int pos, int value) {
      checkPosOfGet(pos);
      if(isEmpty())
      {
          throw new EmptyException("顺序表为空");
      }
      this.elem[pos]=value;
    }

    //删除toRemove这个数字
    @Override
    public void remove(int toRemove) {
       if(isEmpty()){
           throw new EmptyException("顺序表为空，不能删除");
       }
       int index=indexOf(toRemove);
       for (int i=index;i<usedSize-1;i++){
           elem[i]=elem[i+1];
       }
       usedSize--;
    }

    @Override
    public int size() {
        return this.usedSize;
    }

    @Override
    public void clear() {
         usedSize = 0;
    }

    @Override
    public void display() {
     for(int i=0;i<usedSize;i++)
     {
         System.out.print(elem[i]+" ");;
     }
        System.out.println();//打印顺序表当中所有的元素
    }

    @Override
    public boolean isFull() {
        return usedSize== elem.length;
    }

    @Override
    public boolean isEmpty() {
        return usedSize==0;
    }
}
