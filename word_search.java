package src;

public class word_search {

    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == word.charAt(0) && search(board, word, i, j, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean search(char[][] board, String word, int i, int j, int index) {
        // Base case: if the index equals the length of the word, all characters are matched
        if (index == word.length()) {
            return true;
        }

        // Boundary and match condition
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(index)) {
            return false;
        }

        // Mark the cell as visited
        char temp = board[i][j];
        board[i][j] = '#';

        // Explore all possible directions: up, down, left, right
        boolean found = search(board, word, i - 1, j, index + 1) ||  // up
                search(board, word, i + 1, j, index + 1) ||  // down
                search(board, word, i, j - 1, index + 1) ||  // left
                search(board, word, i, j + 1, index + 1);    // right

        // Unmark the cell (backtrack)
        board[i][j] = temp;

        return found;
    }

    public static void main(String[] args) {
        word_search ws = new word_search();
        char[][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };
        System.out.println(ws.exist(board, "ABCCED")); // Output: true
        System.out.println(ws.exist(board, "SEE"));    // Output: true
        System.out.println(ws.exist(board, "ABCB"));   // Output: false
    }
}
