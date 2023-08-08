package stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class truck_passing_the_bridge {
    public static void main(String[] args) {
        int[] tw = {7,4,5,6};
        System.out.println(truckPassingTheBridgeSolution(2, 10, tw));
    }
    static class Truck {
        int weight;
        int move;
        public Truck(int weight){
            this.weight = weight;
            this.move = 1;
        }
        public void moving(){
            move++;
        }
    }
    public static int truckPassingTheBridgeSolution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Truck> waitQ = new LinkedList<>(); //대기 중인 트럭
        Queue<Truck> moveQ = new LinkedList<>(); //이동 중인 트럭

        //대기 중인 트럭
        for (int t : truck_weights){
            waitQ.offer(new Truck(t));
        }

        int answer = 0;
        int curWeight = 0; // 현재 다리 위에 있는 트럭들의 무게

        //대기 트럭과 이동 중인 트럭이 없을경우 반복문 종료
        while (!waitQ.isEmpty() || !moveQ.isEmpty()){
            //반복문 한 사이클이 1초
            answer++;

            /*
            이동 트럭이 없을 경우 대기 중인 트럭 객체를 가져옴
            이동 트럭 큐에 삽입
             */
            if (moveQ.isEmpty()){
                Truck t = waitQ.poll();
                curWeight += t.weight;
                moveQ.offer(t);
                continue;
            }
            // 다리 위에 있는 트럭들을 한 칸씩 이동
            for (Truck t : moveQ){
                t.moving();
            }
            // 앞의 트럭이 다리를 지난 경우 총 무게에서 뺌
            if (moveQ.peek().move > bridge_length){
                Truck t = moveQ.poll();
                curWeight -= t.weight;
            }
            /*
            대기 중인 트럭이 존재하고 다리에 있는 트럭들의 무게와 대기 중인 무게를 합하였을 때
            다리가 견딜 수 있는 무게보다 작거나 같을 경우
            대기 중인 트럭 이동
             */
            if (!waitQ.isEmpty() && curWeight + waitQ.peek().weight <= weight){
                Truck t = waitQ.poll();
                curWeight += t.weight;
                moveQ.offer(t);
            }
        }


        return answer;
    }
}
