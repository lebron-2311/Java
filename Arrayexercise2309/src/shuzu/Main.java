package shuzu;

class MyClass {
    public static int staticField;  // 静态字段

    public static void staticMethod() {  // 静态方法
        System.out.println("This is a static method.");
    }

    public void instanceMethod() {  // 实例方法
        System.out.println("This is an instance method.");
    }
}

public class Main {
    public static void main(String[] args) {
        // 访问静态字段和调用静态方法
        MyClass.staticField = 10;
        System.out.println("Static Field: " + MyClass.staticField);
        MyClass.staticMethod();

        // 实例化对象并访问实例方法
        MyClass obj = new MyClass();
        obj.instanceMethod();
    }
}