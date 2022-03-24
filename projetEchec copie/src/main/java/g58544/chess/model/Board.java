package g58544.chess.model;

import java.util.List;
import java.util.ArrayList;

import static g58544.chess.model.Color.*;

public class Board {

    public static final int BOARD_SIZE = 8;
    public static final int INITIAL_BLACK_ROW = 6;
    public static final int INITIAL_WHITE_ROW = 1;
    private Square[][] board;

    /**
     * Constructor of board of 8X8 square empty
     */
    public Board() {
        this.board = new Square[BOARD_SIZE][BOARD_SIZE];
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                board[i][j] = new Square(null);
            }
        }
    }

    /**
     * return the initial position for the black and white piece.
     * @param color of piece
     * @return the row position
     */
    public int getInitialRow(Color color) {
        if (color == BLACK) {
            return INITIAL_BLACK_ROW;
        }
        return INITIAL_WHITE_ROW;
    }

    /**
     * Boolean testing if the position is within the Board limit.
     *
     * @param position of the piece
     * @return true or false
     */
    public boolean contains(Position position) {
        if (position.getRow() < 0 || position.getRow() >= 8 || position.getColumn() < 0 || position.getColumn() >= 8) {
            return false;
        }
        return true;
    }


    /**
     * Put the piece on the board
     *
     * @param piece    of the board
     * @param position of row and column
     */
    public void setPiece(Piece piece, Position position) {
        if (!contains(position)) {
            throw new IllegalArgumentException("The position must be between 0 and 7 for Row an Column");
        }
        board[position.getRow()][position.getColumn()].setPiece(piece);
    }

    /**
     * return the position of the piece on the board
     *
     * @param position of row and column
     * @return position of the piece on the board
     */
    public Piece getPiece(Position position) {
        if (!contains(position)) {
            throw new IllegalArgumentException("The position must be between 0 and 7 for Row an Column");
        }
        return board[position.getRow()][position.getColumn()].getPiece();
    }

    /**
     * remove the position of the piece on the board
     *
     * @param position of row and column
     */
    public void dropPiece(Position position) {
        if (!contains(position)) {
            throw new IllegalArgumentException("The position must be between 0 and 7 for Row an Column");
        }
        board[position.getRow()][position.getColumn()].setPiece(null);
    }

    /**
     * Verify if the position of the piece on the board is free
     *
     * @param position of row and column
     * @return true or false
     */
    public boolean isFree(Position position) {
        if (!contains(position)) {
            throw new IllegalArgumentException("The position must be between 0 and 7 for Row an Column");
        }
        return board[position.getRow()][position.getColumn()].isFree();
    }

    /**
     * Verify if the position of the piece on the board is occupied by the opposite color
     *
     * @param position of row and column
     * @param color    color of the piece
     * @return true or false
     */
    public boolean containsOppositeColor(Position position, Color color) {
        if (!contains(position)) {
            throw new IllegalArgumentException("The position must be between 0 and 7 for Row an Column");
        }
        if (isFree(position)) {
            return false;
        }
        Color color2 = board[position.getRow()][position.getColumn()].getPiece().getColor();
        if (color2 == color) {
            return false;
        }
        return true;
    }

    /**
     * Get ell the position of occupied by the player in an array.
     *
     * @param player the player color
     * @return an array os position
     */
    public List<Position> getPositionsOccupiedBy(Player player) {
        List<Position> positions = new ArrayList<>();
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                Position current = new Position(i, j);
                if (!isFree(current)) {
                    if (!containsOppositeColor(current, player.getColor())) {
                        positions.add(current);
                    }
                }
            }
        }
        return positions;
    }
}
