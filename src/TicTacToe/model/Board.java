package TicTacToe.model;

public class Board {
    int size;
    PlayingPiece[][] board;

    public Board(int size) {
        this.size = size;
        board = new PlayingPiece[size][size];

    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public PlayingPiece[][] getBoard() {
        return board;
    }

    public void setBoard(PlayingPiece[][] board) {
        this.board = board;
    }

    boolean isValidMove(int row, int col) {
        return row >= 0 && row < size &&
                col >= 0 && col < size &&
                board[row][col] == null;
    }

    public boolean placePiece(PlayingPiece piece, int row, int col) {
        if (!isValidMove(row, col)) {
            return false;
        }
        board[row][col] = piece;
        return true;
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null) {
                    System.out.print("_ ");
                } else {
                    System.out.print(board[i][j].getPieceType() + " ");
                }
            }
            System.out.println();
        }
    }

}
