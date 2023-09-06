package algorithm.dynamicProgramming;

public class FibonacciRecDp {
    // 피보나치 수를 기억하는 배열(최대 100번째까지)
    public static int[] fibonacciNumbers = new int[100];

    // 피보나치 수를 저장하는 배열을 초기화
    public static void initFibonacciNumbers(){
        for (int i = 0; i < fibonacciNumbers.length; i++){
            fibonacciNumbers[i] = -1;
        }
    }

    // 인수 n의 피보나치 수를 반환하는 메소드
    public static int fibonacciRecursionDp(int n){
        System.out.printf("fibonacci(%d)이(가) 호출되었습니다.\n", n);

        if (fibonacciNumbers[n] == -1){
            if (n == 0){
                // 0번째 피보나치 수는 0을 저장
                fibonacciNumbers[n] = 0;
            } else if (n == 1) {
                // 1번째 피보나치 수는 1을 저장
                fibonacciNumbers[n] = 1;
            } else {
                // 이후의 피보나치 수를 구해 저장
                fibonacciNumbers[n] = fibonacciRecursionDp(n - 1) + fibonacciRecursionDp(n - 2);
            }
        }
        // 피보나치 수를 반환
        return fibonacciNumbers[n];
    }

    public static void main(String[] args) {
        // 피보나치 수를 저장한느 배열을 초기화
        initFibonacciNumbers();

        // 5번째 피보나치 수를 표시
        System.out.printf("5번째 피보나치 수 = %d\n", fibonacciRecursionDp(5));
    }
}
