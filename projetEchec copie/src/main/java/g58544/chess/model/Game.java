package g58544.chess.model;

import java.util.List;

public class Game implements Model {

    private Board board;
    private Player white;
    private Player black;
    private Player currentPlayer;

    /**
     * Constructor for the board, white and black player.
     *
     * @param board
     * @param white
     * @param black
     * @param currentPlayer
     */
    public Game(Board board, Player white, Player black, Player currentPlayer) {
        this.board = board;
        this.white = white;
        this.black = black;
        this.currentPlayer = new Player(Color.WHITE);
    }


    @Override
    public void start() {
        board = new Board();
        currentPlayer = new Player(Color.WHITE);
    }

    @Override
    public Piece getPiece(Position pos) {
        if (!board.contains(pos))
            throw new IllegalArgumentException("The position is not located in the board");

        return board.getPiece(pos);
    }

    @Override
    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    @Override
    public Player getOppositePlayer() {
        return black;
    }

    @Override
    public boolean isCurrentPlayerPosition(Position pos) {
        if (!board.contains(pos))
            throw new IllegalArgumentException("The position is not located in the board");

        return board.isFree(pos);
    }

    @Override
    public void movePiecePosition(Position oldPos, Position newPos) {

    }

    @Override
    public boolean isGameOver() {
        return false;
    }

    @Override
    public List<Position> getPossibleMoves(Position position) {
        return null;
    }
}
