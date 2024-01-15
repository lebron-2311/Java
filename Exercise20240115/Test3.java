package Exercise20240115;

import Tree.Test;

public class Test3 {
    public int removeDuplicates(int[] nums) {
         int n=nums.length;
         int count=1;
         if(n==0){
             return 0;
         }
         for (int i=0;i<n-1;i++){
             if(nums[i]==nums[i+1]){
                 count++;
                 if(count==3){
                     nums[i+1]=nums[i];
                     for(int j=i+2;j<n;j++)
                     {
                         nums[i]=nums[j];
                     }
                     n--;
                     i--;
                 }
             }
         }
        return n;
    }
    public static void main(String[] args) {
        Test3 test3=new Test3();
        int[] array = new int[] {0, 0,0,0,1, 1, 1, 2};
        int length = test3.removeDuplicates(array);
        for (int i = 0; i < length; i++) {
            System.out.println(array[i]);
        }
    }

}
