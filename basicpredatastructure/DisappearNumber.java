package basicpredatastructure;
/*数组nums包含从0到n的所有整数，但其中缺了一个。请编写代码找出那个缺失的整数。你有办法在O(n)时间内完成吗？*/
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length+1;
        int totalSum = ((n + 1) * n) / 2;
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        int missingNumber = totalSum - actualSum;
        return missingNumber;
    }
}

public class DisappearNumber {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int f = solution.missingNumber(new int[]{1, 2, 4, 5});
        System.out.println(f);
    }
}