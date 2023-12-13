package String1213;

import java.util.Locale;

/*如果再将所有大写字符转换为小写字符，并且移除所有非字母数字字符之后，短语正着读和反着读都一样。则可以认为该短语是一个回文串*/
class Solution {
    public static boolean isCharacterNum(char ch) {
        if (Character.isDigit(ch) || Character.isLetter(ch)) {
            return true;
        }
        return false;
    }

    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            while (left < right && !isCharacterNum(s.charAt(left))) {
                left++;
            }
            while (left < right && !isCharacterNum(s.charAt(right))) {
                right--;
            }

            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }
}
public class Testhuiwenchuan {
    public static void main(String[] args) {
        char ch = '3';
        System.out.println(Character.isDigit(ch));
        char ch1 = 'a';
        System.out.println(Character.isLetter(ch1));
        String str = "aba";
        char ch3 = '3';
        boolean ret1 = Solution.isCharacterNum(ch3);
        System.out.println(ret1);
        Solution solution = new Solution();
        boolean ret=solution.isPalindrome(str);
        System.out.println(ret);

    }

}
