package shuzu231210;

import java.util.Scanner;

public class OnlyOne {
    public static void main(String[] args) {
        int[]arr=new int[5];
        Scanner scanner=new Scanner(System.in);
        int b=0;
        boolean isUnique;
        for(int i=0;i<arr.length;i++)
        {
            arr[i]= scanner.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            isUnique=true;
            for(int j=0;j<arr.length;j++)
            {
                if (i!=j && arr[i] == arr[j]) {
                    isUnique=false;
                    break;
                }
            }
            if(isUnique==true)
            {
                b=arr[i];
                break;
            }
        }
        System.out.println(b);

    }
}
