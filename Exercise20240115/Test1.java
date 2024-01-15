package Exercise20240115;

import Exercise240112.Test;

public class Test1 {
    public static int removeDuplicates(int[] nums){
        int n=nums.length;
        int k=n;
        for(int i=0;i<n-1;i++){
             if(nums[i]==nums[i+1]){
                 for(int j=i+1;j<n;j++){
                     nums[j-1]=nums[j];

                 }
                 k--;/*记录元素个数*/
                 n--;//元素向前移动，数组长度变短
                 i--;//元素向前移动，i也要对应的减小，而不是一直向后走，回回到前一个位置
             }
        }
        return k;
    }

    public static void main(String[] args) {
        Test1 test1=new Test1();
        int []Array=new int[] {0,0,1,1,2};
        int length=test1.removeDuplicates(Array);
        for(int i=0;i<length;i++){
            System.out.print(Array[i]+" ");
        }

    }

}
