package practice_Java;

import java.util.ArrayList;
import java.util.Arrays;

public class make_array {
    public static void main(String[] args) {
        System.out.println(makeArraySolution(10,3));
        System.out.println(Arrays.toString(makeArraySolution02(10,3)));
    }
    public static ArrayList makeArraySolution(int n, int k) {
        ArrayList answer = new ArrayList();
        for(int i = 1; i < 1000; i++){
            if (n >= k * i)
                answer.add(k * i);
            else
                break;
        }
        return answer;
    }
    public static int[] makeArraySolution02(int n, int k) {
        int count = n / k;
        int[] answer = new int[count];
        for (int i = 1; i <= count; i++){
            answer[i - 1] = k * i;
        }
        return answer;
    }
}
