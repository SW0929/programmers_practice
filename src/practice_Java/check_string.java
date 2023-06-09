package practice_Java;

public class check_string {
    public static void main(String[] args) {
        System.out.println(solution("banana","ana"));
        System.out.println(solution2("banana","ana"));
    }
    public static int solution(String my_string, String target) {
        int answer = 0;
        if (my_string.contains(target)){
            answer = 1;
        }else{
            answer = 0;
        }
        return answer;
    }
    public static int solution2(String my_string, String target){

        int answer = my_string.contains(target) ? 1 : 0;

        return answer;
    }
}
