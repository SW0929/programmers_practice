package practice_Java;

public class emphasize_a {
    public static void main(String[] args) {
        System.out.println(emphasizeASolution("abstract algebra"));
    }
    public static String emphasizeASolution(String myString) {
        String answer = "";
        answer = myString.toLowerCase().replaceAll("a", "A");

        return answer;
    }
}
