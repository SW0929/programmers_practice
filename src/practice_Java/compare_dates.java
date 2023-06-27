package practice_Java;


import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;

public class compare_dates {
    public static void main(String[] args) {
        int []a = {2021, 12, 28};
        int []b = {2021, 12, 29};
        System.out.println(compareDatesSolution(a,b));
    }
    public static int compareDatesSolution(int[] date1, int[] date2) {
        int answer = 0;
        Date d1 = new Date(date1[0], date1[1], date1[2]);
        Date d2 = new Date(date2[0], date2[1], date2[2]);
        answer = d1.compareTo(d2);
        boolean before = d1.before(d2); // d1이 d2보다 이전 날짜이면 true
        if (answer < 0){
            return 1;
        }else{
            return 0;
        }
    }
    public static int compareDatesSolution02(int[] date1, int[] date2) {
        return Arrays.compare(date1, date2) < 0 ? 1 : 0;
    }

    public static int compareDatesSolution03(int[] date1, int[] date2) {
        LocalDate dateA = LocalDate.of(date1[0], date1[1], date1[2]);
        LocalDate dateB = LocalDate.of(date2[0], date2[1], date2[2]);

        if (dateA.isBefore(dateB)) {
            return 1;
        } else {
            return 0;
        }
    }

}
