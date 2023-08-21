package algorithm;

import java.util.Arrays;

public class insertSort {
    public static void main(String[] args) {
        int[] array = {90, 34, 78, 12, 56};
        int ins, cmp, temp;

        // 정렬 전의 배열 내용을 표시
        System.out.println("정렬 전 배열");
        System.out.println(Arrays.toString(array));

        //삽입 정렬로 오름차순 정렬
        for (ins = 1; ins < array.length; ins++){
            // 왼쪽 끝의 숫자는 정렬 끝났다고 가정했기 때문에
            // 정렬되지 않은 숫자 중 왼쪽 끝 (index) 1 부터 비교 시작
            temp = array[ins];

            for (cmp = ins - 1; cmp >= 0; cmp--){
                /*
                 정렬된 숫자 중 비교 숫자보다 큰 숫자가 있으면 자리를 교체한다.
                 아래의 코드에서는 한 칸씩 이동하는 방식
                 ex) 34 90 78 일 때 34 90 90
                 이후 내부 반복문을 종료하면 34 78 90 으로 정렬된다.
                 */
                if (array[cmp] > temp){
                    array[cmp + 1] = array[cmp];
                }else {
                    break;
                }
            }
            array[cmp + 1] = temp;
        }
        // 정렬 후의 배열 내용을 표시
        System.out.println("정렬 전 배열");
        System.out.println(Arrays.toString(array));
    }
}
/*
1. 최초 왼쪽 끝의 숫자는 정렬이 끝났다고 가정
2. 정렬되지 않은 나머지 숫자 중 왼쪽 끝의 숫자를 정렬이 끝난 숫자와 비교하여 왼쪽 숫자가 크면 바꿈
 */

// 다중 반복문을 사용하며 시간복잡도 O(n^2)
