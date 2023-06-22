package practice_Java;

import java.util.StringTokenizer;

public class simple_exp_cal {
    public static void main(String[] args) {
        System.out.println(simpleExpCalSolution("43 + 12"));
    }
    public static int simpleExpCalSolution(String binomial) {
        int answer = 0;
        StringTokenizer stringTokenizer = new StringTokenizer(binomial, " ");
        int a = Integer.parseInt(stringTokenizer.nextToken());
        String exp = stringTokenizer.nextToken();
        int b = Integer.parseInt(stringTokenizer.nextToken());

        switch (exp){
            case "+":
                answer = a + b;
                break;
            case "-":
                answer = a - b;
                break;
            case "*":
                answer = a * b;
                break;
        }
        return answer;
    }
    public static int simpleExpCalSolution02(String binomial) {
        String[] cal = binomial.split(" ");

        if (cal[1].equals("+")) {
            return (Integer.parseInt(cal[0])) + (Integer.parseInt(cal[2]));
        } else if (cal[1].equals("-")) {
            return (Integer.parseInt(cal[0])) - (Integer.parseInt(cal[2]));
        } else {
            return (Integer.parseInt(cal[0])) * (Integer.parseInt(cal[2]));
        }
    }

}
