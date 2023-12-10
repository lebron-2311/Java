package shuzu231210;

import java.util.Scanner;

public class FindTarget {
    public static void main(String[] args) {
        int []arr={2,7,11,15};
        int target=0;
        Scanner scanner=new Scanner(System.in);
        target=scanner.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    System.out.println("["+i+","+j+"]");
                }

            }
        }
    }
}
