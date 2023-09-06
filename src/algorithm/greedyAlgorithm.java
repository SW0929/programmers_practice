package algorithm;

/*
 배낭 문제(특정 kg을 담을 수 있는 배낭에 5가지의 무게와 값이 다른 물건을 조합하여 무게를 맞추고 최대금액 출력, 물건은 한 번만 사용)
 탐욕 알고리즘은 '가치가 큰 것부터 차례로 물건을 고른다'는 간단한 알고리즘이다.
 최적의 답은 아님
 */
public class greedyAlgorithm {
    public static void main(String[] args) {
        final int KNAP_MAX = 6;     // 배낭의 최대 무게
        final int ITEM_NUM = 5;     // 물건의 종류
        int totalWeight = 0;        // 무게의 합계
        int totalValue = 0;         // 가치의 합계

        // 물건의 정보(가치가 큰 순서로 정렬)
        char[] name = { 'E', 'D', 'C', 'B', 'A'};
        int[] weight = { 5, 4, 3, 2, 1};
        int[] value = {650, 500, 350, 300, 100};

        // 가치가 큰 순서로 고르기
        for (int i = 0; i < ITEM_NUM; i++){
            if (totalWeight + weight[i] <= KNAP_MAX){
                System.out.printf("물건 %c를 선택.\n", name[i]);
                totalWeight += weight[i];
                totalValue += value[i];
            } else {
                break;
            }
        }

        // 결과를 표시
        System.out.printf("무게의 합계 = %dkg\n", totalWeight);
        System.out.printf("가치의 합계 = %d원\n", totalValue);
    }
}
