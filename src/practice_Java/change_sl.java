package practice_Java;

import java.util.stream.IntStream;

public class change_sl {
    public static void main(String args[]){

        System.out.println(changeSlSolution("aBcDeFg"));
    }

    public static String changeSlSolution(String myString) {
        String answer = "";
        answer = myString.toLowerCase();
        return answer;
    }
}
