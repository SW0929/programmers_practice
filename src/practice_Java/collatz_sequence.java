package practice_Java;

import java.util.ArrayList;
import java.util.Arrays;

public class collatz_sequence {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(collatzSequenceSolution02(10)));
    }
    public static int[] collatzSequenceSolution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(n);
        while (n != 1){
            if (n % 2 == 0){
                n /= 2;
                list.add(n);
            }else{
                n = 3 * n + 1;
                list.add(n);
            }
        }

        return Arrays.stream(list.toArray(new Integer[list.size()])).mapToInt(i->i).toArray();
    }
    public static int[] collatzSequenceSolution02(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        while (n != 1){
            list.add(n);
            n = n % 2 == 0 ? (n / 2) : (3 * n + 1);
        }
        list.add(1);

        return Arrays.stream(list.toArray(new Integer[list.size()])).mapToInt(i->i).toArray();
    }
}
