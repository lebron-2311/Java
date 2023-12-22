package LinkList;

public class Test {
    public static void main(String[] args) {
        MyLinkList myLinkList=new MyLinkList();
        myLinkList.createList();
        System.out.println("============");
        myLinkList.display();
        System.out.println(myLinkList.contains(12));
        System.out.println(myLinkList.contains(16));
        System.out.println(myLinkList.size());
        myLinkList.addFirst(11);
        myLinkList.addLast(99);
        myLinkList.addIndex(0,9999);//在任意位置插入
        myLinkList.display();
        myLinkList.removeAllKey(12);
        myLinkList.display();
        myLinkList.reverseList();
        System.out.println("翻转");
        myLinkList.display();
        MyLinkList.ListNode ret=myLinkList.middleNode();
        System.out.println(ret.val);
    }
}
