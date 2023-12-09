package shuzu;

public class Test {
    public static void main(String[] args) {
        int []array=new int[100];
        //int[100]array={0};
        int a=1;
        for (int i=0;i<100;i++)
        {
            array[i]=a;
            a++;
            System.out.print(array[i]+" ");//不换行加空格
        }

    }
}
