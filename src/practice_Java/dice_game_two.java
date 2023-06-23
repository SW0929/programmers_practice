package practice_Java;

public class dice_game_two {
    public static void main(String[] args) {
        System.out.println(diceGameTwoSolution(5,3,3));
    }
    public static int diceGameTwoSolution(int a, int b, int c) {
        int answer = 0;
        if (a == b && b == c){
            answer = (a+b+c) * (a*a+b*b+c*c)*(a*a*a+b*b*b+c*c*c);
        }else if(a != b && b != c && a != c){
            answer = a + b + c;
        }else{
            answer = (a+b+c) * (a*a+b*b+c*c);
        }

        return answer;
    }
    public static int diceGameTwoSolution02(int a, int b, int c) {
        int answer = 1;

        int count = 1;
        if(a == b || a == c || b == c) {
            count++;
            System.out.println("1");
        }

        if(a == b && b == c) {
            count++;
            System.out.println("1");
        }

        for(int i = 1; i <= count; i++) {
            answer *= (pow(a,i)+pow(b,i)+pow(c,i));
        }

        return answer;
    }

    private static int pow(int a, int b) {
        if(b == 0) return 1;
        return a * pow(a, b-1);
    }
}
