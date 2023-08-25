package algorithm.binarySearchTree;


// BST_DFS 클래스 정의
class BST_DFS_search {
    public int data;  // 요솟값
    public int left;  // 왼쪽 요소의 연결 정보
    public int right; // 오른쪽 요소의 연결 정보
}

public class BST_element_search {
    // 이진 탐색 트리의 실체가 되는 배열(요소 수는 최대 10)
    public static BST_DFS_search[] tree = new BST_DFS_search[10];

    // 루트 요소의 물리적 위치 인덱스(연결 리스트의 head)
    public static int rootIdx = 0;

    // 다음으로 추가할 요소의 물리적 위치 인덱스
    public static int newInx = 0;

    // 이진 탐색 트리에 요소를 추가하는 메소드
    public static void addBst(int data){
        int currentIdx;     // 현재 요소의 물리적 위치 인덱스
        boolean addFlag;    // 요소 추가가 완료되었는지 확인하는 플래그

        // 물리적 위치에 요솟값과 연결 정보 추가
        tree[newInx].data = data;
        tree[newInx].left = -1;
        tree[newInx].right = -1;

        // 루트 요소가 아니라면 논리적 순서에 따라 요소 위치 탐색 및 결정
        if (newInx != rootIdx){
            currentIdx = rootIdx;   //루트부터 이진 탐색 트리를 내려감
            addFlag = false;        //요소 추가가 완료되지 않음
            do {
                // 루트 요소값보다 더 작으면 왼쪽으로 내려감
                if (data < tree[currentIdx].data){
                    /*
                     왼쪽으로 내려갔을 때 끝이면 left 에 요소의
                     물리적 위치 인덱스를 추가(연결 정보 설정)
                     */
                    if (tree[currentIdx].left == -1){
                        tree[currentIdx].left = newInx;
                        addFlag = true;
                    }
                    // 왼쪽으로 내려갔을 때 끝이 아니라면 왼쪽의 요소보다 더 내려감
                    else {
                        currentIdx = tree[currentIdx].left;
                    }
                }
                // 루트 요솟값보다 더 크면 오른쪽으로 내려감(동일한 값은 없음)
                else {
                    /*
                     오른쪽으로 내려갔을 때 끝이면 right 에 요소의
                     물리적 위치 인덱스를 추가(연결 정보 설정)
                     */
                    if (tree[currentIdx].right == -1){
                        tree[currentIdx].right = newInx;
                        addFlag = true;
                    }
                    // 오른쪽으로 내려갔을 때 끝이 아니라면 오른쪽의 요소보다 더 내려감
                    else {
                        currentIdx = tree[currentIdx].right;
                    }
                }
            } while (addFlag == false);
        }
        // 다음에 추가할 요소를 위해 물리적 위치의 인덱스를 1 늘림
        newInx++;
    }

    //이진 검색 트리의 실체인 배열을 물리적 위치 순서로 표시하는 메소드
    public static void printPhysicalBST(){
        for (int i = 0; i < newInx; i++){
            System.out.printf("tree[%d] : data = %d, left = %d, right = %d\n", i, tree[i].data, tree[i].left, tree[i].right);
        }
    }

    //이진 탐색 트리를 논리적인 순서(깊이 우선 탐색)로 표시하는 메서드
    public static void printLogicalBST(int currentIdx){
        if (currentIdx != -1){
            System.out.printf("tree[%d] : data = %d, left = %d, right = %d\n", currentIdx, tree[currentIdx].data, tree[currentIdx].left, tree[currentIdx].right);
            // 재귀 호출 부분
            printLogicalBST(tree[currentIdx].left);
            printLogicalBST(tree[currentIdx].right);
            // 막다른 길을 직면했을 때 다시 돌아가 다른 선택지를 택하는 것
        }
    }

    // *******여기가 새로 추가된 코드*******
    /*
    이진 탐색 트리를 탐색하는 메소드(특정 요소)
    찾고자 하는 요소가 없을 경우 -1 반환
     */
    public static int searchBST(int x){
        int idx = -1 ;              // 찾은 요소의 인덱스
        int currentIdx = rootIdx;   // 현재 요소의 인덱스

        while (currentIdx != -1){
            if (tree[currentIdx].data == x){
                idx = currentIdx;
                break;
            } else if (tree[currentIdx].data > x) {
                // 찾고자 하는 값이 비교 값보다 작으면 왼쪽
                currentIdx = tree[currentIdx].left;
            } else {
                // 찾고자 하는 값이 비교 값보다 크면 오른쪽
                currentIdx = tree[currentIdx].right;
            }
        }
        return idx;
    }

    // 프로그램 실행의 시작점인 main 메소드
    public static void main(String[] args) {
        // 자바는 인스턴스 생성이 필요
        for (int i = 0; i < tree.length; i++){
            tree[i] = new BST_DFS_search();
        }
        // 요소를 추가하면서 이진 탐색 트리를 구성
        addBst(4);
        addBst(6);
        addBst(5);
        addBst(2);
        addBst(3);
        addBst(7);
        addBst(1);
/*
        // 물리적 위치 순서로 표시
        printPhysicalBST();

        // 이진 탐색 트리를 논리적인 순서(깊이 우선 탐색)로 표시
        System.out.println("-----------------------------------------");
        printLogicalBST(rootIdx);
*/
        // 이진 탐색 트리를 탐색
        System.out.printf("data 값이 '5'일 때의 물리적 위치 탐색 결과 = tree[%d]\n", searchBST(5));
        System.out.printf("data 값이 '8'일 때의 물리적 위치 탐색 결과 = tree[%d]\n", searchBST(8));
    }
}
