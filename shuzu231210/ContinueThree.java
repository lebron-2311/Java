package shuzu231210;

import java.util.Scanner;

public class ContinueThree {
    public static void main(String[] args) {
        int[]arr= new int[5];
        Scanner scanner=new Scanner(System.in);

        for (int i=0;i<arr.length;i++)
        {
           arr[i]= scanner.nextInt();
        }
        for (int i=0;i<arr.length-2;i++)
        {
            if((arr[i]%2!=0)&&(arr[i+1]%2!=0)&&(arr[i+2]%2!=0))
            {
                System.out.println(true);
                System.out.println("存在连续三个元素都是奇数的情况，即"+"["+arr[i]+arr[i+1]+arr[i+2]+"]");
                break;
            }
            else{
                System.out.println(false);
                System.out.println("不存在连续三个元素都是奇数的情况");

            }
        }
    }
}
