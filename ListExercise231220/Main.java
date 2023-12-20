package ListExercise231220;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<List<Integer>> nestedList = new ArrayList<>();

        List<Integer> innerList1 = new ArrayList<>();
        innerList1.add(1);
        innerList1.add(2);
        innerList1.add(3);

        List<Integer> innerList2 = new ArrayList<>();
        innerList2.add(4);
        innerList2.add(5);
        innerList2.add(6);
        System.out.println(innerList1);
        System.out.println(innerList2);
        nestedList.add(innerList1);
        nestedList.add(innerList2);
        System.out.println(nestedList);
        System.out.println(nestedList.get(0));
        System.out.println(nestedList.get(1));
    }
    public static void main3(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        //第一种遍历方式
        System.out.println(arrayList);
        for(int i=0;i<arrayList.size();i++)
        {
            System.out.print(arrayList.get(i)+" ");
        }
        System.out.println();
        for(int x : arrayList){
            System.out.println(x+" ");
             }

        Iterator<Integer> it= arrayList.iterator();
        while (it.hasNext()){
            System.out.println(it.next()+" ");
        }
    }
    public static void main2(String[] args) {
        ArrayList<Integer> arraylist1=new ArrayList<>();
        arraylist1.add(10);
        arraylist1.add(20);
        arraylist1.add(30);
        System.out.println(arraylist1);
        ArrayList<Number> arraylist2=new ArrayList<>(arraylist1);
        arraylist2.add(999999);
        System.out.println(arraylist2);
        List<Number> list=arraylist2.subList(0,1);
        System.out.println(list);
        List<Number> list2=arraylist2.subList(0,2);//左闭右开
        System.out.println(list2);
        list2.set(0,19);
        System.out.println(list2);
        System.out.println(arraylist2);
    }
    public static void main1(String[] args) {
        MyArrayList myArrayList=new MyArrayList();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.add(5);
        myArrayList.add(6);
        myArrayList.remove(2);
        System.out.println(myArrayList.isEmpty());
        myArrayList.add(2,1);
        System.out.println(myArrayList.get(3));
        myArrayList.display();
    }
}
