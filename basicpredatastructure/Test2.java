package basicpredatastructure;


public class Test2<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public static void main(String[] args) {
        Test2<Integer> myClass = new Test2<>();
        myClass.setValue(10);
        int value = myClass.getValue(); // 获取值，并自动拆箱为 int 类型
        System.out.println(value); // 输出：10
    }
}