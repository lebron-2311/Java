package exercise231217;

import java.util.Arrays;
import java.util.List;

public class shuzu {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        String arrayString = Arrays.toString(array);
        System.out.println(arrayString); // 输出: [1, 2, 3, 4, 5]
        System.out.println("------------------------------------");
        int[] sourceArray = {1, 2, 3, 4, 5};
        int[] newArray = Arrays.copyOf(sourceArray, sourceArray.length);
        for(int i=0;i<newArray.length;i++)
        {
            System.out.print(newArray[i]+" ");
        }
        System.out.println("\n");
        System.out.println("------------------------------------");
        int[] sourceArray1 = {1, 2, 3, 4, 5};
        int[] newArray1 = Arrays.copyOfRange(sourceArray, 1, 4); // 复制索引1到3的元素
        for(int i=0;i<newArray1.length;i++)
        {
            System.out.print(newArray1[i]+" ");
        }
        System.out.println("\n");
        System.out.println("------------------------------------");
        int[] array2 = new int[5];
        Arrays.fill(array2, 10); // 将数组的所有元素设置为10
        for(int i=0;i<array2.length;i++)
        {
            System.out.print(array2[i]+" ");
        }
        System.out.println("\n");
        System.out.println("------------------------------------");
        int[] array3 = {1, 2, 3};
        int[] array4 = {1, 2, 3};
        boolean isEqual = Arrays.equals(array3, array4); // 比较两个数组是否相等
        System.out.println(isEqual);
        System.out.println("\n");
        System.out.println("------------------------------------");
        String[] array5 = {"apple", "banana", "orange"};
        List<String> list = Arrays.asList(Arrays.toString(array5)); // 将数组转换为List集合
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }


    }
}
