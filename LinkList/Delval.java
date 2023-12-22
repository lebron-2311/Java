package LinkList;

import java.util.Scanner;

import java.util.Scanner;

public class Delval {
    public int removeElement(int[] nums, int val) {
        int i = 0; // 指向当前有效元素的位置

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }

        return i; // 返回新数组的有效长度
    }

    public static void main(String[] args) {
        Delval delval = new Delval();
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入数组元素个数：");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("请输入数组元素：");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.print("请输入要删除的元素值：");
        int val = scanner.nextInt();

        int length = delval.removeElement(nums, val);

        System.out.println("删除后的数组为：");
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
