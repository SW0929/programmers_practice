package practice_Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class make_array_five {
    public static void main(String[] args) {
        String[] st = {"0123456789","9876543210","9999999999999"};
        System.out.println(Arrays.toString(makeArraySolution(st,50000,5,5)));
    }
    public static int[] makeArraySolution(String[] intStrs, int k, int s, int l) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < intStrs.length; i++){
            int num = Integer.parseInt(intStrs[i].substring(s,s+l));

            if (num > k){
                list.add(num);
            }

        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
