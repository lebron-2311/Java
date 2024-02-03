package MapSet;

public class HashBuck {

    static class Node{
        public int key;
        public int val;
        public Node next;

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    public Node[]array=new Node[10];
    public int usedSize;

    public void push(int key,int val){
        Node node=new Node(key,val);
        //1.找到位置
        int index=key%array.length;
        //2.遍历数组
        Node cur=array[index];

        while (cur!=null){
            if(cur.key==key){
                cur.val=val;
                return;
            }
             cur=cur.next;
        }
        //找到位置开始插入元素
        if(array[index]==null){
            array[index]=node;
        }else {
            cur=array[index];
            while (cur.next!=null){
                cur=cur.next;//如果当前位置已经放元素了，指针下移
            }
            cur.next=node;//当前指针的下一个元素放node
        }
        usedSize++;
        if(doLoadFactor()>=0.75){
            reSize();
        }

    }
    private double doLoadFactor(){
        return usedSize*1.0/array.length;
    }

    private void reSize(){
        Node[] newArray=new Node[array.length*2];
        for(int i=0;i<array.length;i++){
            Node cur=array[i];
            while (cur!=null){
                int index=cur.key%newArray.length;
                Node curNext=cur.next;
                cur.next=newArray[index];
                newArray[index]=cur;
                cur=curNext;
            }
        }
        array=newArray;
    }
    public int get(int key){
        //1.找到位置
        int index=key%array.length;
        //2.遍历数组
        Node cur=array[index];

        while (cur!=null){
            if(cur.key==key){
                return cur.val;
            }
            cur=cur.next;
        }
        return -1;
    }





}
