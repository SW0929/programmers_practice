package algorithm.dynamicProgramming;
/*
 동적 계획법은
 '분할한 문제의 답을 기억해 두고, 이를 재사용함으로써 같은 문제를 여러 번 푸는 낭비를 방지한다'
 라는 프로그래밍 기법이다.

 */
public class FibonacciDP {
    // 피보나치 수를 기억하는 배열(최대 100번째까지)
    public static int[] fibonacciNumbers = new int[100];

    // 인수 n의 피보나치 수를 반환하는 메소드
    public static int fibonacciDp(int n){
        for (int i = 0; i <= n; i++){
            if (i == 0){
                // 0번째 피보나치 수는 0을 저장
                fibonacciNumbers[i] = 0;
            } else if (i == 1) {
                // 1번째 피보나치 수는 1을 저장
                fibonacciNumbers[i] = 1;
            } else {
                // 이후의 피보나치 수를 구해 저장
                fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];
            }
        }
        // 피보나치 수를 반환
        return fibonacciNumbers[n];
    }

    public static void main(String[] args) {
        // 0~8번째 피보나치 수를 표시
        for (int n = 0; n <= 8; n++){
            System.out.printf("%d, ", fibonacciDp(n));
        }
        System.out.printf("\n");
    }
}
