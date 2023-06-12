package practice_Java;

public class check_string {
    public static void main(String[] args) {
        System.out.println(checkStringSolution01("banana","ana"));
        System.out.println(checkStringSolution02("banana","ana"));
    }
    public static int checkStringSolution01(String my_string, String target) {
        int answer = 0;
        if (my_string.contains(target)){
            answer = 1;
        }else{
            answer = 0;
        }
        return answer;
    }
    public static int checkStringSolution02(String my_string, String target){

        int answer = my_string.contains(target) ? 1 : 0;

        return answer;
    }
}
