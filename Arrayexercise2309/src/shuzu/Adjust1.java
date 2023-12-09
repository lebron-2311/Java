package shuzu;

public class Adjust1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] arr1 = new int[arr.length];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {  // 奇数
                arr1[j] = arr[i];
                j++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {  // 偶数
                arr1[j] = arr[i];
                j++;
            }
        }

        // 输出调整后的数组
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}