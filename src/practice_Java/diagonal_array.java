package practice_Java;

public class diagonal_array {
    public static void main(String[] args) {

    }
    public int diagonalArraySolution(int[][] board, int k) {
        int answer = 0;
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++){
                if (board[i][j] <= k){
                    answer+=board[i][j];
                }
            }
        }
        return answer;
    }
}
