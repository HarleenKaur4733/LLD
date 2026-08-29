package TicTacToe;

import java.util.LinkedList;
import java.util.Queue;

import TicTacToe.model.Board;
import TicTacToe.model.Move;
import TicTacToe.model.PieceType;
import TicTacToe.model.Player;
import TicTacToe.model.PlayingPiece;

public class Game {
    Board board;
    Queue<Player> players;

    public Game() {
        board = new Board(3);
        players = new LinkedList<>();
        Player player1 = new Player("Player_a", new PlayingPiece(PieceType.O));
        Player player2 = new Player("Player_b", new PlayingPiece(PieceType.X));

        players.add(player1);
        players.add(player2);
    }

    public void start() {
        while (true) {
            board.printBoard();
            Player currentPlayer = players.poll();

            Move move = currentPlayer.makeMove();
            boolean success = board.placePiece(
                    currentPlayer.getPiece(),
                    move.getRow(),
                    move.getCol());

            if (!success) {
                System.out.println("Invalid move, try again!");
                players.add(currentPlayer);
                Player currPlayer = players.poll();
                players.add(currPlayer);
                continue;
            }

            if (checkWinner(currentPlayer)) {
                board.printBoard();
                System.out.println(currentPlayer.getName() + " wins!");
                break;
            }

            players.add(currentPlayer);
        }

    }

    private boolean checkWinner(Player player) {
        PlayingPiece[][] b = board.getBoard();
        PieceType type = player.getPiece().getPieceType();

        // rows & cols
        for (int i = 0; i < 3; i++) {
            if ((b[i][0] != null && b[i][1] != null && b[i][2] != null &&
                    b[i][0].getPieceType() == type &&
                    b[i][1].getPieceType() == type &&
                    b[i][2].getPieceType() == type) ||

                    (b[0][i] != null && b[1][i] != null && b[2][i] != null &&
                            b[0][i].getPieceType() == type &&
                            b[1][i].getPieceType() == type &&
                            b[2][i].getPieceType() == type)) {
                return true;
            }
        }

        // diagonals
        if ((b[0][0] != null && b[1][1] != null && b[2][2] != null &&
                b[0][0].getPieceType() == type &&
                b[1][1].getPieceType() == type &&
                b[2][2].getPieceType() == type) ||

                (b[0][2] != null && b[1][1] != null && b[2][0] != null &&
                        b[0][2].getPieceType() == type &&
                        b[1][1].getPieceType() == type &&
                        b[2][0].getPieceType() == type)) {
            return true;
        }

        return false;
    }

}
