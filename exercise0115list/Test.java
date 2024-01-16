package exercise0115list;

public class Test {
    public static void main(String[] args) {
        MyArrayList myArrayList=new MyArrayList();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(2,4);
        myArrayList.display();
        System.out.println(myArrayList.contains(10));
        System.out.println(myArrayList.indexOf(2));
        System.out.println(myArrayList.indexOf(100));
        System.out.println(myArrayList.get(1));
        myArrayList.set(2,9);
        myArrayList.display();
        myArrayList.remove(2);
        myArrayList.display();
        System.out.println(myArrayList.size());
        myArrayList.clear();
        System.out.println(myArrayList.size());
    }
}
