package practice_Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class number_between_x {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(numberBetweenXSolution("oxooxoxxox")));
    }
    public static int[] numberBetweenXSolution(String myString) {

        String[] a = myString.split("x");
        int[] answer;
        //myString 마지막이 x인 경우
        if (myString.charAt(myString.length()-1) == 'x'){
            answer = new int[a.length+1];
            for (int i = 0; i < answer.length; i++){
                if (answer.length - 1 == i){
                    answer[i] = 0;
                }else{
                    answer[i] = a[i].length();
                }

            }
        }else {
            answer = new int[a.length];
            for (int i = 0; i < answer.length; i++){
                answer[i] = a[i].length();
            }
        }



        return answer;
    }
}
