package practice_Java;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class slice_string_sort {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(sliceStringSortSolution("dxccxbbbxxaaaa")));
    }

    public static String[] sliceStringSortSolution(String myString) {
        String[] answer = myString.split("x");
        Arrays.sort(answer);
        List<String> s = new ArrayList<>(Arrays.asList(answer));
        //List<String> s = Arrays.asList(answer); 이렇게 하면
        //UnsupportedOperationException 에러 발생
        //List 형을 new로 초기화하지 않는 상태에서 Arrays로 생성하였을 시 주로 발생
        if (s.contains("")){
            s.removeAll(Collections.singleton(""));
            answer = s.toArray(new String[s.size()]);
        }
        return answer;
    }
    public static String[] sliceStringSortSolution02(String myString) {
        //String[]::new means size -> new String[size]
        return Arrays.stream(myString.split("x")).filter(s -> !s.isEmpty()).sorted().toArray(String[]::new);
    }
}
