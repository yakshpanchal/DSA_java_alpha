public class nQueens {
    public static void nQueens_fun(char board[][], int row) {
        // base case
        if (row == board.length) {
            printboard(board);
            return;
        }
        // work
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueens_fun(board, row + 1);
                board[row][j] = 'X';
            }

        }
    }

    public static boolean isSafe(char board[][], int row, int col) {
        // check in vertical up
        for (int i = row; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // check in diagonal left
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // check in diagonal right
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void printboard(char[][] board) {
        System.out.println("------------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        // initilizate
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }
        nQueens_fun(board, 0);

    }
}
