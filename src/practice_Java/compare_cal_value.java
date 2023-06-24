package practice_Java;

public class compare_cal_value {
    public static void main(String[] args) {
        System.out.println(compareCalValueSolution(2,91));
    }
    public static int compareCalValueSolution(int a, int b) {

        String string = Integer.toString(a) + Integer.toString(b);

        return Integer.parseInt(string) >= 2 * a * b ? Integer.parseInt(string) : 2 * a * b;
    }

    public static int compareCalValueSolution02(int a, int b) {
        return Math.max(Integer.parseInt(String.valueOf(a)+String.valueOf(b)), 2 * a * b);
    }
}
