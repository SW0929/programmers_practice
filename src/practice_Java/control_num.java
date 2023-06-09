package practice_Java;

public class control_num {
    public static void main(String[] args) {
        System.out.println(solution(0, "wsdawsdassw"));
        System.out.println(solution2(0, "wsdawsdassw"));
    }
    public static int solution(int n, String control) {
        int answer = 0;
        for (int i = 0; i < control.length(); i++){

            switch (control.charAt(i)){
                case 'w':
                    n+=1;
                    break;
                case 's':
                    n-=1;
                    break;
                case 'd':
                    n+=10;
                    break;
                case 'a':
                    n-=10;
                    break;
                default:
                    break;
            }

        }
        answer = n;
        return answer;
    }
    public static int solution2(int n, String control) {
        int answer = n;
        for (char ch : control.toCharArray()){
            switch (ch){
                case 'w': answer += 1; break;
                case 's': answer -= 1; break;
                case 'd': answer += 10; break;
                case 'a': answer -= 10; break;
                default:break;
            }
        }

        return answer;
    }
}
