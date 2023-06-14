package practice_Java;

public class concatenated_number {
    public static void main(String[] args) {
        int[] a = {3,4,5,2,1};
        System.out.println(concatenatedNumberSolution(a));
    }
    public static int concatenatedNumberSolution(int[] num_list) {
        int answer = 0;
        String even = "";
        String odd = "";
        for (int i = 0; i < num_list.length; i++){
            if (num_list[i] % 2 == 0){
                even+=num_list[i];
            }else{
                odd+=num_list[i];
            }
        }
        answer = Integer.parseInt(even) + Integer.parseInt(odd);
        return answer;
    }
}
