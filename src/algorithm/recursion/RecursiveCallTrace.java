package algorithm.recursion;

public class RecursiveCallTrace {
    // 인수 n의 계승을 구하는 메소드
    public static int factorialTrace(int n){
        System.out.printf("factorial(%d)이(가) 호출되었습니다.\n", n);
        if (n == 0){
            // 0의 계승은 1이므로 1을 반환하여 재귀 호출을 종료
            System.out.printf("factorial(0)이(가) 호출되었습니다.\n");
            return 1;
        } else {
            // n의 계승ㅁ은 n * (n - 1)의 계승이므로, 재귀 호출로 (n - 1)의 계승을 구함
            int retVal = n * factorialTrace(n - 1);
            System.out.printf("factorial(%d)이(가) %d을 반환했습니다.\n", n, retVal);
            return retVal;
        }
    }

    public static void main(String[] args) {
        int ans;

        // 5의 계승을 구함
        ans = factorialTrace(5);
        System.out.printf("%d\n", ans);
    }
}
