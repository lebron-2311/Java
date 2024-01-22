package exercise20240121;

import java.util.Arrays;

public class TestHeap {
    public int usedSize;
    public int[] elem;

    public TestHeap() {
        this.elem=new int[20];
    }

    public void initElem(int []array){
        for (int i=0;i<array.length;i++){
                elem[i]=array[i];
                usedSize++;
        }
    }
    public void createBigHeap(){
        for (int parent=(usedSize-1-1)/2;parent>=0;parent--){
             siftDown(parent,usedSize);
        }
    }
    public void siftDown(int parent,int end){
        int child=2*parent+1;
        while (child<end){
            if(child+1<usedSize&&elem[child]<elem[child+1]){
                child++;//先看左右孩子谁更大
            }
            if(elem[child]>elem[parent]){
                swap(child,parent);// 如果孩子节点大于父节点，交换它们的位置
                parent=child;//parent向下走
                child=2*parent+1;//孩子向下走，其实就是整体向下走
            }else {
                break;
            }
        }
    }
    private void swap(int i,int j) {
        int tmp = elem[i];
        elem[i] = elem[j];
        elem[j] = tmp;
    }

    public int poll(){
        int tmp=elem[0];
        swap(0,usedSize-1);//交换第一个值和最后一个值，然后usedSize--弹出元素
        usedSize--;
        siftDown(0,usedSize);//调整堆
        return tmp;
    }

    public void offer(int val){
        if(isFull()){
            this.elem= Arrays.copyOf(elem,2*elem.length);
        }
        elem[usedSize]=val;
        usedSize++;
        siftUp(usedSize-1);
    }
    private  void  siftUp(int child){
        int parent=(child-1)/2;
        while (child>0){
           if(elem[child]>elem[parent]){
               swap(child,parent);
               child = parent;
               parent = (child-1)/2;
           }
           else {
               break;
           }
        }

    }
/*
    siftDown方法从较小的索引（数组下标小的位置）开始调整，将较大的元素向下移动，以保持堆的性质。

    siftUp方法则相反，它从较大的索引（数组下标大的位置）开始调整，将较大的元素向上移动，以保持堆的性质。

    在siftDown中，我们从父节点开始向下移动，将较大的元素逐级下沉，以确保每个父节点都比它的子节点大。

    而在siftUp中，我们从子节点开始向上移动，将较大的元素逐级上浮，以确保每个子节点都比它的父节点小。

    这两个方法是根据堆的性质进行调整的，具体的调整方向取决于堆的实现以及使用的索引表示方式。*/
    public boolean isFull(){
        return usedSize == elem.length;
    }

    public void display(){
        for(int i=0;i<elem.length;i++){
            System.out.print(elem[i]+" ");
        }
        System.out.println();
    }
}
