package exercise231226;

class MyGenericClass<T> {
    private T item;

    // 构造函数，接受一个泛型类型参数
    public MyGenericClass(T item) {
        this.item = item;
    }

    // 获取存储的泛型对象
    public T getItem() {
        return item;
    }

    // 重写 toString 方法以输出泛型对象的字符串表示
    @Override
    public String toString() {
        return String.valueOf(item);  // 将泛型类型转换为字符串输出
    }
}

public class Main {
    public static void main(String[] args) {
        // 创建一个存储整数的 MyGenericClass 实例
        MyGenericClass<Integer> integerObj = new MyGenericClass<>(10);
        System.out.println(integerObj);  // 输出整数

        // 创建一个存储浮点数的 MyGenericClass 实例
        MyGenericClass<Double> doubleObj = new MyGenericClass<>(3.14);
        System.out.println(doubleObj);  // 输出浮点数

        // 创建一个存储字符串的 MyGenericClass 实例
        MyGenericClass<String> stringObj = new MyGenericClass<>("Hello");
        System.out.println(stringObj);  // 输出字符串
    }
}