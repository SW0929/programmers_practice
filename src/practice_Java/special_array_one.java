package practice_Java;

import java.util.Arrays;

public class special_array_one {
    public static void main(String[] args) {
        //이차원 배열 출력은 deepToString()
        //일차원 배열 출력은 toString()
        System.out.println(Arrays.deepToString(specialArrayOneSolution(3)));
    }
    public static int[][] specialArrayOneSolution(int n) {
        int[][] answer = new int[n][n];
        for (int i = 0; i < answer.length; i++){
            answer[i][i] = 1;
        }
        return answer;
    }
}
