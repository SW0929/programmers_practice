package practice_Java;

public class control_num_two {
    public static void main(String[] args) {
        int[] ary = {0,1,0,10,0,1,0,10,0,-1,-2,-1};
        System.out.println(controlNumTwoSolution(ary));
    }
    public static String controlNumTwoSolution(int[] numLog) {
        String answer = "";
        int check = numLog[0];
        for(int i = 1; i < numLog.length; i++){
            if(check + 1 == numLog[i]){
                check += 1;
                answer +="w";
            }else if(check - 1 == numLog[i]){
                check -= 1;
                answer +="s";
            }else if(check + 10 == numLog[i]){
                check += 10;
                answer +="d";
            }else{
                check -= 10;
                answer +="a";
            }
        }
        return answer;
    }
    public static String controlNumTwoSolution02(int[] numLog) {
        String answer = "";

        for(int i = 0; i < numLog.length-1; i++){
            int a = numLog[i+1] - numLog[i];
            if (a > 1) answer += "d";
            else if (a == 1) answer += "w";
            else if (a < -1) answer += "a";
            else answer += "s";
        }
        return answer;
    }
}
