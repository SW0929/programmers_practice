package algorithm;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] array = {90, 34, 78, 12, 56};
        int ins, cmp, min, temp;

        //정렬 전 배열 내용을 표시
        System.out.println("정렬 전 배열");
        System.out.println(Arrays.toString(array));

        for (ins = 0; ins < array.length - 1; ins++){
            // 정렬되지 않은 배열의 왼쪽 끝의 인덱스 값을 min 으로 초기값으로 입력
            min = ins;
            /*
            내부 반복문이 종료되면 한 번의 싸이클 종료이기 때문에
            배열 왼쪽부터 정렬됨으로 ins + 1
             */
            for (cmp = ins + 1; cmp < array.length; cmp++){
                /*
                최솟값의 index 주소를 min 에 저장
                배열의 최솟값과 자리 교체
                 */
                if (array[cmp] < array[ins]){
                    min = cmp;
                    temp = array[ins];
                    array[ins] = array[min];
                    array[min] = temp;
                }
            }
        }


        //정렬 후 배열 내용을 표시
        System.out.println("정렬 후 배열");
        System.out.println(Arrays.toString(array));
    }
}
/*
1. 배열의 최솟값을 선택
2. 최솟값과 왼쪽 끝의 값과 교환
3. 1, 2 반복

1회 반복 = n - 1, 2회 반복 = n - 2 ~~~ n-1회 반복 = 1회
즉, n^2 / 2 의 값임으로
시간복잡도는 O(n^2) 이다.
 */