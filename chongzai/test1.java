package chongzai;

class A{
    public int sum(int a,int b){
        int c=a+b;
        return c;
    }
    public float sum(float a,float b,float c)
    {
        float d=a+b+c;
        return d;
    }

}
public class test1 {
    public static void main(String[] args) {
        A a=new A();
        int ret=a.sum(1,2);
        System.out.println(ret);
        float ret1=a.sum(1.1f,1.2f,1.3f);
        System.out.println(ret1);
    }
}
