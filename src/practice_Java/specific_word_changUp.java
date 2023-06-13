package practice_Java;

public class specific_word_changUp {
    public static void main(String[] args) {
        System.out.println(specificWordChangeUpSolution("programmers", "p"));
    }
    public static String specificWordChangeUpSolution(String my_string, String alp) {
        String answer = "";
        answer = my_string.replaceAll(alp, alp.toUpperCase());
        return answer;
    }
}
