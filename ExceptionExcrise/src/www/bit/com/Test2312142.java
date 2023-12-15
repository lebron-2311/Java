package www.bit.com;

class Person implements Cloneable{
    public String name;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class Test2312142 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p=new Person();
        Person p2=(Person) p.clone();
        System.out.println(p2);
        System.out.println(10/0);

        //同一时刻只能抛出一个异常
    }
}
