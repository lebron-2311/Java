package homework;

import java.util.Locale;

class Solution {
    public String toLowerCase(String s) {
        return s.toLowerCase();
    }
};
public class A {
    public static void main(String[] args) {
       String s="ZHENG";
       Solution a=new Solution();
       String ret= a.toLowerCase(s);
       System.out.println(ret);
    }
}
