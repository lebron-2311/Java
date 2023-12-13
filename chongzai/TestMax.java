package chongzai;
class B{
    public void max(int a, int b)
    {
        if(a>b)
        {
            System.out.println(a);
        }
        else
            System.out.println("最大的数是"+b);

    }

    public void max(int a, int b, int c)
    {
        int max1=0;
        if(a>b){
            max1=a;
        }
        else {
            max1=b;
        }
        int maxx=(max1>c)?max1:c;
        System.out.println("最大的数是"+maxx);

    }


}
public class TestMax {
    public static void main(String[] args) {
        B b=new B();
        b.max(1,3);
        b.max(1,2,3);
        //void直接.int的话就要new对象出来

    }
}
