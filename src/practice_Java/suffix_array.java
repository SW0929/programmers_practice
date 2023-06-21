package practice_Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class suffix_array {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(suffixArraySolution("banana")));
    }
    public static String[] suffixArraySolution(String my_string) {
        List<String> answer = new ArrayList<>();

        for (int i = 0; i < my_string.length(); i++){
            answer.add( my_string.substring(i));
        }
        answer.sort(Comparator.naturalOrder());
        return answer.toArray(new String[answer.size()]);
    }

    public String[] suffixArraySolution02(String my_string) {
        String[] answer = new String[my_string.length()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = my_string.substring(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}
