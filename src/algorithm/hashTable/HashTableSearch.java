package algorithm.hashTable;
import java.util.*;
// 해시 테이블에 데이터를 저장하고 탐색
/*
 해시 테이블 탐색법의 시간 복잡도는 이상적으로는 O(1) 이다.
 이는 값 수에 관계없이 반복 처리를 하지 않고 1회 처리에서 값을 찾는다는 의미이다.
 */
public class HashTableSearch {
    // 해시 테이븝ㄹ의 실체가 되는 배열
    public static int[] hashTable = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};

    // 해시 함수 역할을 하는 메소드
    public static int hashFuc(int data){
        return data % 10;
    }

    // 프로그램 실행의 시작점
    public static void main(String[] args) {
        int data, hashValue;

        // 키보드로 데이터를 입력하여 해시 테이블에 저장
        Scanner sc = new Scanner(System.in);
        do {
            // 저장할 데이터 입력
            System.out.printf("\n저장할 데이터 = ");
            data = sc.nextInt();

            // 음수값이 입력되면 데이터 저장을 종료
            if (data < 0){
                break;
            }
            // 해시값을 구함
            hashValue = hashFuc(data);

            // 해시 테이블에 저장
            hashTable[hashValue] = data;
        } while (true);

        // 해시 테이블에서 데이터를 탐색
        do {
            // 검색할 데이터를 키보드로 입력
            System.out.printf("\n탐색할 데이터 = ");
            data = sc.nextInt();

            // 음수값이 입력되면 데이터 검색을 종료
            if (data < 0){
                break;
            }

            // 해시값을 구함
            hashValue = hashFuc(data);

            // 검색한 결과를 표시
            if (hashTable[hashValue] == data){
                System.out.printf("%d번째에서 발견되었습니다.\n", hashValue);
            } else {
                System.out.printf("찾을 수 없습니다.\n");
            }
        } while (true);
        sc.close();
    }
}
