package practice_Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class third_make_array {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[][] b = {{1,3},{0,4}};
        System.out.println(Arrays.toString(thirdMakeArraySolution(a, b)));
    }
    public static int[] thirdMakeArraySolution(int[] arr, int[][] intervals) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++){
            for (int j = intervals[i][0]; j <= intervals[i][1]; j++) {
                list.add(arr[j]);
            }
        }
        // Integer[] 를 Int[] 로 변환 하는 코드
        answer = Arrays.stream(list.toArray(new Integer[list.size()])).mapToInt(i->i).toArray();
        return answer;
    }
}
