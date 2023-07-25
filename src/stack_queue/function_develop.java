package stack_queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class function_develop {
    public static void main(String[] args) {
        int[] progresses = {2,2,1,2};
        int[] speeds = {1,1,1,1};
        System.out.println(Arrays.toString(functionDevelopSolution(progresses, speeds)));
    }
    public static int[] functionDevelopSolution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> answer = new ArrayList<>();
        int cnt = 1;


        for (int i = 0; i < progresses.length; i++){
            queue.add(day(progresses[i], speeds[i]));
        }
        int a = queue.poll();

        while (true){
            if (queue.isEmpty()){
                answer.add(cnt);
                break;
            }
            if (a >= queue.peek()){
                cnt++;
                queue.remove();
            }else {
                answer.add(cnt);
                cnt = 1;
                a = queue.poll();
            }
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
    //작업이 끝나는 날짜 계산 함수
    public static int day(int progress, int speed){
        int remain = 100 - progress;
        int dayCal = remain / speed + (remain % speed > 0 ? 1 : 0);
        return dayCal;
    }
    //다른 풀이
    public int[] functionDevelopSolution02(int[] progresses, int[] speeds) {
        int[] dayOfend = new int[100];
        int day = -1;
        for (int i = 0; i < progresses.length; i++){
            while (progresses[i] + (day*speeds[i]) < 100){
                day++;
            }
            dayOfend[day]++;
        }
        return Arrays.stream(dayOfend).filter(i -> i != 0).toArray();
    }
}
