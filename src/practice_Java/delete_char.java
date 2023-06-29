package practice_Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class delete_char {
    public static void main(String[] args) {
        int[] ary = {1, 16, 6, 15, 0, 10, 11, 3};
        System.out.println(deleteCharSolution("apporoograpemmemprs", ary));
    }
    public static String deleteCharSolution(String my_string, int[] indices) {
        String answer = "";
        String [] st = my_string.split("");
        List<String> list = new ArrayList<>(Arrays.asList(st));


        for (int i = 0; i < indices.length; i++){
            list.set(indices[i], "");

        }
        for (int i = 0; i < list.size(); i++){
            if (list.get(i) != "");{
                answer += list.get(i);
            }
        }
        return answer;
    }

    public static String deleteCharSolution02(String my_string, int[] indices) {
        String answer = "";
        String[] st = my_string.split("");

        for (int i = 0; i < indices.length; i++){
            st[indices[i]] = "";
        }
        for (String s : st){
            answer += s;
        }
        return answer;
    }
}
