package LinkList;

import java.util.ArrayList;
import java.util.List;

public class Yanghuisanjiao {

    public List<List<Integer>> generate(int numRows){
        List<List<Integer>> ret=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        list.add(1);
        ret.add(list);

        for(int i=1;i<numRows;i++){
            List<Integer> curRow=new ArrayList<>();
            //处理第一个数字
            curRow.add(1);
            //处理中间数字
            List<Integer> prevRow=ret.get(i-1);
            for (int j=1;j<i;j++){
                int x=prevRow.get(j)+prevRow.get(j-1);
                curRow.add(x);
            }
            //处理最后一个数字
            curRow.add(1);
            ret.add(curRow);
        }
        return ret;
    }
    public static void main(String[] args) {
        Yanghuisanjiao yanghuisanjiao=new Yanghuisanjiao();
        int numRows=5;
        List<List<Integer>> triangle=yanghuisanjiao.generate(numRows);

        for (List<Integer> row:triangle){
            for (int num:row){
                System.out.print(num+" ");
            }
            System.out.println();
        }

    }
}
