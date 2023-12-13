package String1213;

public class Findlastwordlen {
    public static void main(String[] args) {
        String str = "hello nowcoder";
        String[] words = str.split(" ");
        String str1 = words[words.length - 1];
        System.out.println(str1);
    }
}
