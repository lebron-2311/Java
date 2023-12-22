package LinkList;
public class DelRepeat {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 2, 3, 3, 4};
        int[] expectedNums = {0, 1, 2, 3, 4};

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                for (int j = i + 2; j < nums.length; j++) {
                    nums[j - 1] = nums[j];
                }
            }
        }

        for (int k = 0; k < nums.length; k++) {
            assert nums[k] == expectedNums[k];
        }

        System.out.println("Array after removing duplicates:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
