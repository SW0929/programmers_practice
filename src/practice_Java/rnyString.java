package practice_Java;
import java.lang.String;

public class rnyString {
    public static void main(String[] args) {
        System.out.println(rnyStringSolution01("masterpiece"));
        System.out.println(rnyStringSolution02("masterpiece"));
    }
    public static String rnyStringSolution01(String rny_string) {
        String answer = "";
        answer = rny_string.replace("m", "rn");
        return answer;
    }
    public static String rnyStringSolution02(String rny_string) {
        String answer = "";
        answer = rny_string.replaceAll("m", "rn");
        return answer;
    }
}
