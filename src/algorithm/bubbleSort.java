package algorithm;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] array = {90, 34, 78, 12, 56};
        int ins, cmp, temp;

        //정렬 전 배열 내용을 표시
        System.out.println("정렬 전 배열");
        System.out.println(Arrays.toString(array));

        //버블 정렬로 오름차순 정렬
        for (ins = 0; ins < array.length; ins++){
            /*
            내부 반복문이 1회 동작할때 마다 배열 가장 오른쪽 값이 큰 값으로 정렬되기 때문에
            조건식의 값을 줄이면서 정렬 수행함
             */
            for (cmp = 0; cmp < array.length - ins - 1; cmp++){
                /*
                아래의 코드는
                왼쪽의 값이 오른쪽의 값보다 큰 경우 자리를 변경해 주는 코드이다.
                1. 변수 temp 에 왼쪽 값을 저장하고
                2. 왼쪽 배열을 오른쪽 값을 저장한다.
                3. 오른쪽 배열에 저장해둔 temp 값을 저장한다.
                 */
                if (array[cmp] > array[cmp + 1]){
                    temp = array[cmp];
                    array[cmp] = array[cmp + 1];
                    array[cmp + 1] = temp;
                }

            }
        }

        //정렬 후 배열 내용을 표시
        System.out.println("정렬 후 배열");
        System.out.println(Arrays.toString(array));
    }
}
/*
1. 배열 처음부터 끝까지 이웃 사이의 요소를 비교하여 작은 값이 앞으로 오도록 요소를 교체한다.
2. 1 을 반복하면 배열의 시작 부분에 가장 작은 값을 갖는 요소가 위치한다.
즉, 배열 처음부터 끝까지 이웃 요소들과 값을 비교해 정렬을 수행한다.

1회 반복 = n - 1, 2회 반복 = n - 2 ~~~ n-1회 반복 = 1회
즉, n^2 / 2 의 값임으로
시간복잡도는 O(n^2) 이다.
 */