package exercise231226;

import java.util.Arrays;

class MyArray {
    public Object[] array = new Object[10];
    public Object getPos(int pos) { return this.array[pos];
    }
    public void setVal(int pos,Object val) {
        this.array[pos] = val; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(array[i]);
        }
        sb.append("]");
        return sb.toString();
    }
}
public class TestDemo {
    public static void main(String[] args) {
        MyArray myArray = new MyArray();
        myArray.setVal(0,10);
        myArray.setVal(1,"hello");//字符串也可以存放
        String ret =(String) myArray.getPos(1);//编译报错
        System.out.println(ret);
        System.out.println(myArray.toString());
    }
}