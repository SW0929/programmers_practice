package practice_Java;

import java.util.Arrays;

public class sequence_queries_one {
    public static void main(String[] args) {
        int []a = {0,1,2,3,4};
        int [][]b = {{0,1}, {1,2}, {2, 3}};
        System.out.println(Arrays.toString(sequenceQueriesSolution(a, b)));
    }
    public static int[] sequenceQueriesSolution(int[] arr, int[][] queries) {


        for (int i = 0; i < queries.length; i++){
            for (int j = queries[i][0]; j <= queries[i][1]; j++){
                arr[j]++;
            }
        }

        return arr;
    }
}
