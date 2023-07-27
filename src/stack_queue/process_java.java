package stack_queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class process_java {
    public static void main(String[] args) {
        int[] priorities = {1,1,9,1,1,1};
        System.out.println(processJavaSolution(priorities, 0));
    }
    public static int processJavaSolution(int[] priorities, int location) {
        int answer = 0;
        int l = location;
        Queue<Integer> queue = new LinkedList<>();
        for (int i : priorities){
            queue.add(i);
        }
        Arrays.sort(priorities);
        int size = priorities.length - 1;

        while (!queue.isEmpty()){
            //FIFO 큐의 값
            int i = queue.poll();

            //우선순위가 가장 큰 값과 큐의 맨 앞의 값 비교
            /*
            같은 값일 때 실행 순서 증가, 원하는 index 의 값이 맞는지 확인
            우선 순위가 적합한 경우 반복문이 종료
            */

            if (i == priorities[size - answer]){
                answer++;
                l--;
                System.out.println("l값 if : "+l);
                if (l < 0){
                    break;
                }
            }
            //다른 값인 경우 추출한 큐의 값을 다시 추가
            /*
            l 은 원하는 값을 추출하였으나 우선순위가 아직 아님으로 다시 맨 뒤에 삽입되었기 떄문에
            큐의 사이즈 즉, 맨 뒤의 인덱스로 초기화 해준다.
            */
            else {
                queue.add(i);
                l--;
                System.out.println("l값 else : "+l);
                if (l < 0){
                    l = queue.size() - 1;
                }
            }
        }
        return answer;
    }
}