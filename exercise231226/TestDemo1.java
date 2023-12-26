package exercise231226;

class MyArray1<T> {
    public T[] array = (T[])new Object[10];//1
    public T getPos(int pos) {
        return this.array[pos];
    }
    public int setVal(int pos, T val) {
        this.array[pos] = val;
        return pos;
    }
}
public class TestDemo1 {
    public static void main(String[] args) {
        MyArray1<Integer> myArray = new MyArray1<>();//2 myArray.setVal(0,10);
        myArray.setVal(1,12);
        int ret = myArray.getPos(1);//3
        System.out.println(ret);
        int ret1= myArray.setVal(2,4);//4
        System.out.println(myArray.toString());
        System.out.println(ret1);
    }
}