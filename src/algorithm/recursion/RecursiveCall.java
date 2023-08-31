package algorithm.recursion;

public class RecursiveCall {
    // 인수 n의 계승을 구하는 메소드
    public static int factorial(int n){
        if (n == 0){
            // 0의 계승은 1이므로 1을 반환하여 재귀 호출을 종료
            return 1;
        } else {
            // n의 계승은 n * (n - 1)의 계승이므로, 재귀 호출로 (n - 1)의 계승을 구함
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int ans;

        // 5의 계승을 구함
        ans = factorial(5);
        System.out.printf("%d\n", ans);
    }
    // 5 > 4 > 3 > 2 > 1 > 0 순으로 호출되고 0 > 1 > 2 > 3 > 4 > 5 순으로 반환한다.
}
/*
 재귀 호출이란 '함수안에서 자기 자신을 호출하여 반복 처리한다'는 프로그래밍 기법이다.
 재귀 호출은 처리에 시간이 오래 걸리고 메모리를 많이 소모한다.
 짧고 낭비 없이 효육적으로 프로그램을 작성할 수 있을 때만 사용해야 하는 기법이다.
 */