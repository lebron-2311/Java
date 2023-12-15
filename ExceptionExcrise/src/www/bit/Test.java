package www.bit;

public class Test {
    public static void main(String[] args) {
        try {
            int []array={1,2,3,4};
            System.out.println(array[9]);

            System.out.println("测试");//不执行
        }catch (NullPointerException e){
            e.printStackTrace();
            System.out.println("捕捉到了空指针异常！");
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("捕获到了数组越界异常.....");
        }catch (RuntimeException e){
            //子异常写在上面，父异常写在下面
        }finally {
            System.out.println("finally被执行了");
        }
        System.out.println("after");
    }
}
