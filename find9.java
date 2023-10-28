public class find9 {
    public static void main(String[] args) {
        int i=0;
        int count=0;
        for(i=1;i<101;i++)
        {
            if((i%9==0)||(i%10==9)||(i%10==9))
            {
                count++;

            }
        }
        System.out.println(count);
    }
}
