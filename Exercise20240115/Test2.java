package Exercise20240115;

public class Test2 {
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int i = 0; // 指向当前要比较的元素
        for (int j = 1; j < n; j++) { // 遍历指针
            if (nums[j] != nums[i]) { // 发现不重复元素
                i++; // 移动指向当前要比较的元素的指针
                nums[i] = nums[j]; // 将不重复元素移动到前面
            }
        }
        return i + 1; // 返回不重复元素的个数
    }

    public static void main(String[] args) {
        Exercise20240114.Test2 test2 = new Exercise20240114.Test2();
        int[] array = new int[] {0, 0, 1, 1, 2};
        int length = test2.removeDuplicates(array);
        for (int i = 0; i < length; i++) {
            System.out.println(array[i]);
        }
    }
}
