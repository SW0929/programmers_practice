package algorithm.hashTable;

import java.util.Scanner;

public class HashTableSearchTrace {
    // 해시 테이블의 실체가 되는 배열(요소 10개로 함)
    public static int[] hashTable = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};

    // 해시 함수 역할을 하는 메소드
    public static int hashFunc(int data){
        return data % 10;
    }

    // 프로그램 실행의 시작점인 main 메소드
    public static void main(String[] args) {
        int data, hashValue;

        // 데이터의 키를 입력하여 해시 테이블에 저장
        Scanner sc = new Scanner(System.in);
        do {
            // 저장할 데이터 입력
            System.out.printf("\n저장할 데이터 = ");
            data = sc.nextInt();

            // 음수값이 입력되면 데이터의 저장을 종료
            if (data < 0){
                break;
            }

            // 해시값을 구함
            hashValue = hashFunc(data);
            System.out.printf("해시값 = %d %% 10 = %d\n", data, hashValue);

            // 해시 테이블에 저장
            hashTable[hashValue] = data;
            System.out.printf("hashTable[%d]에 %d를 저장합니다.\n", hashValue, data);
        }while (true);

        // 해시 테이블에서 데이터를 검색
        do {
            // 검색할 데이터의 키를 입력
            System.out.printf("\n검색할 데이터 = ");
            data = sc.nextInt();

            // 음수값이 입력되면 데이터 검색을 종료
            if (data < 0){
                break;
            }

            // 해시값을 구함
            hashValue = hashFunc(data);
            System.out.printf("해시값 = %d %% 10 = %d\n", data, hashValue);

            // 검색한 결과를 표시
            if (hashTable[hashValue] == data){
                System.out.printf("hashTable[%d]같은 %d이므로, 발견된 위치를 표시합니다.\n", hashValue, data);
                System.out.printf("%d번째에서 발견되었습니다.\n", hashValue);
            } else {
                System.out.printf("hashTable[%d]값은 %d이(가) 아니므로, '찾을 수 없습니다'를 표시합니다.\n", hashValue, data);
            }
        } while (true);
        sc.close();
    }
}
