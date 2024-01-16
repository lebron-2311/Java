package exercise0115list;

import ListExercise231220.EmptyException;
import ListExercise231220.PosException;

import java.util.Arrays;

public class MyArrayList implements IList {
    public int elem[];
    public int usedSize;
    public  static final int DEFAULT_CAPACITY=5;

    public MyArrayList() {
        elem=new int[DEFAULT_CAPACITY];
    }

    @Override
    public void add(int data) {
        if (isFull()) {
            elem=Arrays.copyOf(elem, elem.length);
        }
        elem[usedSize++]=data;
    }

    @Override
    public void add(int pos, int data) {
        checkPosOfAdd(pos);
        if(isFull()){
            elem=Arrays.copyOf(elem,elem.length);
        }
        for(int i=usedSize-1;i>=pos;i--){
            elem[i+1]=elem[i];
        }
        elem[pos]=data;
        usedSize++;
    }

    @Override
    public boolean contains(int toFind) {
        if(isEmpty()){
            return false;
        }
        for(int i=0;i<usedSize;i++){
            if(elem[i]==toFind){
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(int toFind) {
        for(int i=0;i<usedSize;i++){
            if(elem[i]==toFind){
                return i;
            }
        }
        return -1;
    }
    private void checkPosOfGet(int pos){
        if(pos<0||pos>=this.usedSize){
            throw new PosException("pos位置不合法"+pos);
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
        if(isEmpty()){
            throw new PosException("顺序表为空");
        }
          this.elem[pos]=value;

    }

    @Override
    public void remove(int toRemove) {
         if(isEmpty()){
             throw  new EmptyException("顺序表为空");
         }
         int index=indexOf(toRemove);
         for(int i=index;i<usedSize-1;i++){
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
         usedSize =0;
    }

    @Override
    public void display() {
        if(isEmpty()){
            return;
        }
        for(int i=0;i<usedSize;i++){
            System.out.print(elem[i]+" ");
        }
        System.out.println();

    }

    @Override
    public boolean isFull() {
        return usedSize==elem.length;
    }

    @Override
    public boolean isEmpty() {
        return usedSize==0;
    }

    private void checkPosOfAdd(int pos){
        if(pos<0||pos>usedSize){
            throw new PosException("pos位置为："+pos);
        }
    }
}
