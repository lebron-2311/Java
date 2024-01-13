package Exercise240112;

import java.util.Arrays;

import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = 0, p2 = 0;
        int[] sorted = new int[m + n];
        int cur;
        while (p1 < m || p2 < n) {
            if (p1 == m) {
                cur = nums2[p2++];
            } else if (p2 == n) {
                cur = nums1[p1++];
            } else if (nums1[p1] < nums2[p2]) {
                cur = nums1[p1++];
            } else {
                cur = nums2[p2++];
            }
            sorted[p1 + p2 - 1] = cur;
        }
        for (int i = 0; i != m + n; ++i) {
            nums1[i] = sorted[i];
        }
    }





    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {1, 3, 0, 0, 0};
        int[] b = {2, 4, 6};
        solution.merge(a, 2, b, 3);
        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}