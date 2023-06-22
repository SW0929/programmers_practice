package practice_Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class remove_ad {
    public static void main(String[] args) {
        String[] string = {"and", "notad", "abcd"};
        System.out.println(Arrays.toString(removeAdSolution(string)));
    }
    public static String[] removeAdSolution(String[] strArr) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < strArr.length; i++){
            if (!strArr[i].contains("ad")){
                list.add(strArr[i]);
            }
        }
        return list.toArray(new String[list.size()]);
    }



    public static String[] removeAdSolution02(String[] strArr) {
        //collect()는 Stream의 데이터를 변형 등의 처리를 하고 원하는 자료형으로 변환해 줍니다.
        List<String> list = Arrays.stream(strArr).filter(m -> !m.contains("ad")).collect(Collectors.toList());
        String[] answer  = new String[list.size()];
        list.toArray(answer);
        return answer;
        }

}
