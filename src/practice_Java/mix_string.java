package practice_Java;

public class mix_string {
    public static void main(String[] args) {
        System.out.println(mixStringSolution("aaaaa", "bbbbb"));
    }
    public static String mixStringSolution(String str1, String str2) {
        String answer = "";
        for (int i = 0; i < str1.length(); i++){
            answer += str1.charAt(i);
            answer += str2.charAt(i);
        }
        return answer;
    }
}
