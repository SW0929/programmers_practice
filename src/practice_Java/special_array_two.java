package practice_Java;

public class special_array_two {
    public static void main(String[] args) {
        int[][] array = {{5,192,33}, {192,72,95},{33,95,999}};
        System.out.println(specialArrayTwoSolution(array));
    }
    public static int specialArrayTwoSolution(int[][] arr) {
        int answer = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if (arr[i][j] == arr[j][i]){
                    answer = 1;
                }else{
                    return answer = 0;
                }
            }
        }
        return answer;
    }
}


