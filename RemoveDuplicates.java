package basicpredatastructure;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                for (int j = i + 2; j < n; j++) {
                    nums[j - 1] = nums[j];
                }
                count++;
                n--;
                i--;
            }
        }

        return nums.length - count;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 2, 3, 3, 4};
        int[] expectedNums = {0, 1, 2, 3, 4};

        int k = removeDuplicates(nums);

        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}