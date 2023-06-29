package practice_Java;

public class read_vertical {
    public static void main(String[] args) {

    }
    public static String readVerticalSolution(String my_string, int m, int c) {
        String answer = "";
        for (int i = 0; i < my_string.length()/m; i++){
            answer+=my_string.charAt(c-1+(m*i));
        }
        return answer;
    }
    public static String readVerticalSolution02(String my_string, int m, int c) {
        String answer = "";
        for (int i = c - 1; i < my_string.length(); i += m) {
            answer += my_string.charAt(i);
        }
        return answer;
    }

}
