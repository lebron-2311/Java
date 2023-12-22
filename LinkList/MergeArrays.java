package LinkList;

import java.util.Arrays;


public class MergeArrays {
    public static void mergeArrays(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i != n; ++i) {
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0}; // 示例中的 nums1 数组
        int m = 3; // 示例中的 m 值
        int[] nums2 = {2, 5, 6}; // 示例中的 nums2 数组
        int n = 3; // 示例中的 n 值

        mergeArrays(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
}