package stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class truck_passing_the_bridge {
    public static void main(String[] args) {
        int[] tw = {7,4,5,6};
        System.out.println(truckPassingTheBridgeSolution(2, 10, tw));
    }
    public static int truckPassingTheBridgeSolution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0; //경과 시간
        int total = 0; //현재 다리를 건너는 트럭들의 총 무게
        int i = 0;
        Stack<Integer> stack = new Stack<>(); //다리를 지난 트럭
        Queue<Integer> queue = new LinkedList<>(); //다리를 건너는 트럭

        //모든 트럭이 다리를 지난 경우 반복문 종료.
        while (stack.size() < truck_weights.length){
            total += truck_weights[i];
            
        }

        return answer;
    }
}
