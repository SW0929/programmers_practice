package practice_Java;

public class check_prefix {
    public static void main(String[] args) {
        System.out.println(checkPrefixSolution("banana", "ban"));
        System.out.println(checkPrefixSolution02("banana", "nan"));
    }
    public static int checkPrefixSolution(String my_string, String is_prefix) {
        int answer = 0;
        if (my_string.substring(0, is_prefix.length()).equals(is_prefix))
            answer = 1;
        else
            answer = 0;
        return answer;
    }
    public static int checkPrefixSolution02(String my_string, String is_prefix) {
        int answer = 0;
        if (my_string.startsWith(is_prefix))
            answer = 1;
        else
            answer = 0;
        return answer;
    }
}
