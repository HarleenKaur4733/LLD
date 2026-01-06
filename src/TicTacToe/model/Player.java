package TicTacToe.model;

import java.util.Scanner;

public class Player {
    String name;
    PlayingPiece piece;
    private Scanner scanner = new Scanner(System.in);

    public Player(String name, PlayingPiece piece) {
        this.name = name;
        this.piece = piece;
    }

    public Move makeMove() {
        System.out.println(name + ", enter row and column:");
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        return new Move(row, col);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayingPiece getPiece() {
        return piece;
    }

    public void setPiece(PlayingPiece piece) {
        this.piece = piece;
    }

}
