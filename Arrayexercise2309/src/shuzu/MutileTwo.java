package shuzu;

import java.util.Arrays;

class muT
{
    public void transform(int []array)
    {
       for(int i=0;i<array.length;i++)
       {
           array[i]=array[i]*2;
       }
    }
}
public class MutileTwo {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        System.out.println(array);
        muT a=new muT();
        a.transform(array);
        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]+" ");

        }
        System.out.println(Arrays.toString(array));
    }
}
