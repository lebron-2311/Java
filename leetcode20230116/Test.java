package leetcode20230116;

public class Test {
    public static void main(String[] args) {
        Solution solution=new Solution();
        int []nums=new int[]{5,6,7,1,2,3,4};
        solution.rotate(nums,2);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
