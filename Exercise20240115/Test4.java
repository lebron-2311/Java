package Exercise20240115;

public class Test4 {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n <= 2) {
            return n; // 数组长度小于等于2，不需要删除元素
        }

        int j = 1; // 指向新数组的下一个位置
        int count = 1; // 当前元素的重复次数

        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                count++; // 当前元素重复次数加1
                if (count <= 2) {
                    nums[j] = nums[i]; // 将新的元素复制到新数组中
                    j++; // 更新指针
                }
            } else {
                count = 1; // 重置重复次数
                nums[j] = nums[i]; // 将新的元素复制到新数组中
                j++; // 更新指针
            }
        }

        return j; // 返回新数组的长度
    }

    public static void main(String[] args) {
        Test4 test4=new Test4();
        int[] array = new int[] {0, 0,0,0,1, 1, 1, 2};
        int length = test4.removeDuplicates(array);
        for (int i = 0; i < length; i++) {
            System.out.println(array[i]);
        }
    }
}
