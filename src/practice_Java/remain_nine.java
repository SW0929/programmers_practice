package practice_Java;

public class remain_nine {
    public static void main(String[] args) {
        System.out.println(remainNineSolution("78720646226947352489"));
    }
    public static int remainNineSolution(String number) {
        int answer = 0;
        for (int i = 0; i < number.length(); i++){
            answer += number.charAt(i) - '0';
        }
        return answer % 9;
    }
    public static int remainNineSolution02(String number) {
        int answer = 0;
        for (char ch : number.toCharArray()){
            answer += ch - '0';
        }
        return answer % 9;
    }
    public static int remainNineSolution03(String number) {
        return number.chars().map(c -> (c - '0') % 9).sum() % 9;
    }
}
