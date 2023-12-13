package homework;



class Solution1 {
    public String toLowerCase(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            //char ch = s.charAt(i); 这行代码是从字符串 s 中获取索引为 i 的字符，并将其赋值给变量 ch。
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);  // 转换为小写字母
            }
            result += ch;  // 将字符添加到结果字符串中
        }
        return result;
    }
}

public class B {
    public static void main(String[] args) {
        String s = "ZHENG";
        Solution1 a = new Solution1();
        String ret = a.toLowerCase(s);
        System.out.println(ret);
    }
}