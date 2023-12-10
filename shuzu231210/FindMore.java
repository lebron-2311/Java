package shuzu231210;


public class FindMore {
    public static void main(String[] args) {
        int []array={1,1,1,3,4};
        int count=array.length/2;
        int count1=0;
        int a=0;
        for (int i=0;i<array.length;i++)
        {
            for(int j=i+1;j<array.length;j++)
            {
                if(array[i]==array[j])
                {
                    a=array[i];
                    count1++;
                }

            }
        }
        if(count1>count)
        {
            System.out.println(a);
        }
    }
}
