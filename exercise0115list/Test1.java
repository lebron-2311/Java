package exercise0115list;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1=new ArrayList<>();
        arrayList1.add(1);
        arrayList1.add(2);
        System.out.println(arrayList1.size());
        System.out.println(arrayList1);
        ArrayList<Number> arrayList2=new ArrayList<>();
        arrayList2.add(9999);
        System.out.println(arrayList2);

        List<Integer> list = arrayList1.subList(0,2);
        System.out.println(list);

    }

}
