package Test;
import java.util.*;
 class Solution {
    public  void merge(int A[], int m, int B[], int n) {

        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while (i>=0&&j>=0){
            if(A[i]>=B[j]){
                A[k]=A[i];
                k--;
                i--;
            }else {
                A[k]=B[j];
                k--;
                j--;
            }
        }
    }
}
public class A {
    public static void main(String[] args) {
        int A[] = new int[6];
        A[0] = 1;
        A[1] = 4;
        A[2] = 2;

     int B[]={5,9,7};
     Arrays.sort(A);
     Arrays.sort(B);
     Solution solution=new Solution();
     solution.merge(A,3,B,3);
     for(int i=0;i<A.length;i++)
     {
         System.out.println(A[i]+" ");
     }
    }
}
