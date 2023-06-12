package practice_Java;

import java.util.stream.IntStream;

public class dif_cal {

    public static void main(String args[]){
        int[] a = {2,3,4,5};
        System.out.println(difCalSolution01(a));
        System.out.println(difCalSolution02(a));
    }

    public static int difCalSolution01(int[] num_list) {
        int answer = 0;
        if (num_list.length >= 11){
            for (int i = 0; i < num_list.length; i++){
                answer += num_list[i];
            }
        }else{
            answer = 1;
            for (int i = 0; i < num_list.length; i++){
                answer *= num_list[i];
            }
        }
        return answer;
    }
    public static int difCalSolution02(int[] num_list) {
        IntStream stream = IntStream.of(num_list);
        return num_list.length>10?stream.sum():stream.reduce(1,(a,b) -> a * b);
    }
}

