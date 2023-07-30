package practice_Java;

import java.math.BigInteger;

public class divide_ball {
    public static void main(String[] args) {
        System.out.println(divideBallSolution(30,15));
    }
    public static long divideBallSolution(int c, int n) {
        if (c == n || n == 0)
            return 1;

        long answer = 1;
        int a = (c - n < n) ? c - n : n;

        for (int i = 0; i < a; i++) {
            answer *= (c - i);
            answer /= (i + 1);
        }


        return answer;
    }
}
