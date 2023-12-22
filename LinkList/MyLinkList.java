package LinkList;

public class MyLinkList implements IList{

  static class ListNode{
        public int val;
        public ListNode next;
        public ListNode prev;
        public ListNode(int val){
            this.val=val;
        }
    }
    public ListNode head;
    public ListNode last;
    public void createList(){
      ListNode node1=new ListNode(12);
      ListNode node2=new ListNode(23);
      ListNode node3=new ListNode(27);
      ListNode node4=new ListNode(69);
      node1.next=node2;
      node2.next=node3;
      node3.next=node4;
      this.head=node1;
    }
    @Override
    public void addFirst(int data) {
      ListNode node=new ListNode(data);
      node.next=this.head;
      this.head=node;
    }

    @Override
    public void addLast(int data) {
      ListNode node=new ListNode(data);
       if(head==null){
         head = node;
       }else {
         ListNode cur=head;
         while (cur.next!=null){
           cur=cur.next;
         }
         cur.next=node;
       }
    }

    @Override
    public void addIndex(int index, int data) throws IndexException{
     if(index<0||index>size()){
       throw new IndexException("index是不合法的:"+index);
     }
     ListNode node=new ListNode(data);
     if(head==null){
       head=node;
       return;
     }
     if(index==0){
       addFirst(data);
       return;
     }
     if(index == size()){
       addLast(data);
       return;
     }
     //中间插入
      ListNode cur=searchPrevIndex(index);
      node.next=cur.next;
      cur.next=node;

    }
    private ListNode searchPrevIndex(int index){
      ListNode cur=head;
      int count=0;
      while (count!=index-1){
        cur=cur.next;
        count++;
      }
      return cur;
    }

    @Override
    public boolean contains(int key) {
      ListNode cur=head;
      while (cur!=null){
        if(cur.val==key){
          return true;
        }
        cur=cur.next;
      }
        return false;
    }

    @Override
    public void remove(int key) {
     if(head==null){
         return;
     }
     if(head.val==key){
         head=head.next;
         return;
     }
     ListNode cur=findPrevKey(key);
     if(cur==null){
         return;
     }
      ListNode del=cur.next;
      cur.next=del.next;
    }
    private  ListNode findPrevKey(int key){
        ListNode cur=head;
        while (cur!=null){
            if(cur.next.val==key){
               return cur;
            }
            else {
                cur=cur.next;
            }
        }
        return cur;
    }


    @Override
    public void removeAllKey(int key) {
        if(head==null){
            return;
        }
     ListNode prev=head;
     ListNode cur=head.next;
     while (cur!=null){
         if(cur.val==key){
             prev.next=cur.next;
             cur=cur.next;
         }else {
             prev=cur;
             cur=cur.next;
         }
     }
     //除了头节点都删除完成了
        if(head.val==key){
            head=head.next;
        }
    }

    @Override
    public int size() {
      int count=0;
      ListNode cur=head;
      while (cur!=null){
        count++;
        cur=cur.next;
      }
        return count;
    }

    @Override
    public void clear() {
        head=null;
    }

    @Override
    public void display() {
     ListNode cur=head;
     while (cur!=null){
       System.out.print(cur.val+" ");
       cur=cur.next;
     }
      System.out.println();
    }


    public void display(ListNode newHead) {
        ListNode cur=newHead;
        while (cur!=null){
            System.out.print(cur.val+" ");
            cur=cur.next;
        }
        System.out.println();
    }


    public ListNode reverseList() {
        if(head==null){
            return head;
        }
        if(head.next==null){
            return head;
        }
        ListNode cur=head.next;
        head.next=null;
        while(cur!=null){
            ListNode curNext;
            curNext=cur.next;
            cur.next=head;
            head=cur;
            cur=curNext;
        }
        return head;
    }

    public ListNode middleNode() {
        if(head==null){
            return null;
        }
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
