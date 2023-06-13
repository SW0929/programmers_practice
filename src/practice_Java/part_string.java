package practice_Java;

public class part_string {
    public static void main(String[] args) {
        System.out.println(partStringSolution("abc", "aabcc"));
        System.out.println(partStringSolution02("abc", "aabcc"));
    }
    public static int partStringSolution(String str1, String str2) {
        if (str2.contains(str1))
            return 1;
        else
            return 0;
    }
    public static int partStringSolution02(String str1, String str2) {
        return str2.contains(str1) ? 1 : 0;
    }
}
