package algorithm.recursion;

/*
 퀵 정렬은 대량의 데이터를 효율적으로 정렬하는 알고리즘이다.
 1. 기준값이 되는 요소를 하나 선택한다.
 2. 나머지 요소를 기준값보다 작은 값과 큰 값으로 그룹 나누기를 반복한다.
 3. 그룹으로 나누어진 데이터가 하나가 될 때까지 1과 2를 반복한다.
 ※ 그룹 나누기 함수(메소드)와 그 함수로 정렬을 수행하는 함수를 준비하면 퀵 정렬 프로그램 작성이 매우 간단해진다.
*/

public class QuickSort {
    // 배열 내용을 표시하는 메서드
    public static void printArray(int[] a){
        for (int i = 0; i < a.length; i++){
            System.out.printf("[" + a[i] + "]");
        }
        System.out.printf("\n");
    }

    // 배열 a[head]~a[tail]을 그룹으로 나누는 메소드
    public static int divideArray(int[] a, int head, int tail){
        System.out.printf("divideArray(a, %d, %d)가 호출되었습니다.\n", head, tail);
        int left, right, temp;
        left = head + 1;    // 배열 첫 요소 + 1부터 뒷 요소로 훑어 가는 위치
        right = tail;       // 배열 끝 요소부터 앞 요소로 훑어 가는 위치

        // 기준값 a[head]보다 작은 요소를 앞쪽으로, 큰 요소를 뒤쪽으로 이동
        while (true){
            // 배열을 첫 요소 + 1부터 뒤쪽으로 훑어가,
            // 기준값보다 큰 요소를 찾음
            while (left < tail && a[head] > a[left]){
                left++;
            }

            // 배열 끝 요소에서 앞으로 훑어 기준값보다 작은 요소를 찾음
            while (a[head] < a[right]){
                right--;
            }

            // 확인할 요소가 없어지면 종료
            if (left >= right){
                break;
            }

            // 기준값보다 큰 a[left]와 기준값보다 작은 a[right]를 교환
            temp = a[left];
            a[left] = a[right];
            a[right] = temp;

            // 다음 요소를 확인함
            left++;
            right--;
        }
        // 기준값 a[head]와 a[right]를 교환
        temp = a[head];
        a[head] = a[right];
        a[right] = temp;

        // 기준값 a[right]의 위치를 반환
        return right;
    }

    // 배열 a[start]~a[end]를 오름차순으로 정렬하는 메소드
    public static void sortArray(int[] a, int start, int end){
        System.out.printf("sortArray(a, %d, %d)가 호출되었습니다.\n", start, end);
        int pivot;  // 배열을 그룹으로 나누는 기준값의 인덱스 위치

        // 배열 요소가 2개 이상인 경우 정렬 처리 진행
        if (start < end){
            // 기준값과의 대소 관계에 따라 그룹 나누기
            pivot = divideArray(a, start, end);

            // 기준값보다 작은 앞쪽 그룹에 동일한 처리를 적용(재귀 호출)
            sortArray(a, start, pivot - 1);

            // 기준값보다 큰 뒤쪽 그룹에 동일한 처리를 적용(재귀 호출)
            sortArray(a, pivot + 1, end);
        }
    }

    public static void main(String[] args) {
        int[] a = { 4, 7, 1, 6, 2, 5, 3};

        // 정렬 전 배열을 표시
        printArray(a);

        // 퀵 정렬 실행
        sortArray(a, 0, a.length - 1);

        // 정렬된 배열을 표시
        printArray(a);
    }
}

/*
 N개의 데이터에 대해서 분할(logN)이 이루어지므로
 이상적인 경우 O(logN * N) 이다.
 최악의 경우 기준값이 최소 또는 최댓값(맨 끝 값)이 되면 선택 정렬과 같은 O(n^2)이 된다.
 */