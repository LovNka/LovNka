package g58544.chess.model;

import java.util.ArrayList;
import java.util.List;

import static g58544.chess.model.Color.BLACK;
import static g58544.chess.model.Color.WHITE;

/**
 * @author AimeNka
 */
public class Piece {
    private Color color;

    /**
     * Constructor for the piece with the color
     *
     * @param color of the piece
     */
    public Piece(Color color) {
        this.color = color;
    }

    /**
     * Getter the color of the piece
     *
     * @return color
     */
    public Color getColor() {
        return color;
    }

    /**
     * Give the list of the possible position for a piece with a given position on the board.
     *
     * @param position of the piece
     * @param board    of the game
     * @return the list of possible position
     */
    public List<Position> getPossibleMoves(Position position, Board board) {
        List<Position> pawnMove = new ArrayList();
        Color actualColor = board.getPiece(position).getColor();

        movePawn1(position, board, actualColor, pawnMove);
        movePawnFirst(position, board, actualColor, pawnMove);

        if (actualColor == WHITE){
            pawnAttackWhiteOnBlack(position, board, actualColor, pawnMove);
        }else {
            pawnAttackBlackOnWhite(position, board, actualColor, pawnMove);
        }

        return pawnMove;
    }

    /*
     * Give the usual move of the pawn
     *
     * @param position of piece
     * @param board    of the game
     * @param move     list of possible move
     */
    private void movePawn1(Position position, Board board, Color color, List<Position> move) {

        if (color == BLACK && board.isFree(position.next(Direction.S))) {
            move.add(position.next(Direction.S));
        } else if (color == WHITE && board.isFree(position.next(Direction.N))) {
            move.add(position.next(Direction.N));
        }
    }

    /*
     * Give the possible movement of the pawn for the first move
     *
     * @param position of piece
     * @param board    of the game
     * @param color    of the piece
     * @param move     list of possible move
     */
    private void movePawnFirst(Position position, Board board, Color color, List<Position> move) {
        Position nextByTwo;
        switch (color){
            case BLACK -> nextByTwo = position.next(Direction.S).next(Direction.S);
            default -> nextByTwo = position.next(Direction.N).next(Direction.N);
        }


        if (color == BLACK && board.isFree(position.next(Direction.S))
                && board.contains(nextByTwo)
                && board.isFree(nextByTwo)
                && board.getInitialRow(BLACK) == position.getRow()) {
            move.add(nextByTwo);
        } else if (color == WHITE && board.isFree(position.next(Direction.N))
                && board.contains(nextByTwo)
                && board.isFree(nextByTwo)
                && board.getInitialRow(WHITE) == position.getRow()) {
            move.add(nextByTwo);
        }
    }

    /**
     * Give the attack move of the pawn if there is an occupation of the opposite color for Black on White
     *
     * @param position of the piece
     * @param board    of the game
     * @param color    of the piece
     * @param move     list of possible move
     */
    private void pawnAttackBlackOnWhite(Position position, Board board, Color color, List<Position> move) {

        if (board.contains(position.next(Direction.SE))
                && board.containsOppositeColor(position.next(Direction.SE), color)
                && board.contains(position.next(Direction.SW))
                && board.containsOppositeColor(position.next(Direction.SW), color)) {
            move.add(position.next(Direction.SE));
            move.add(position.next(Direction.SW));
        } else if (board.contains(position.next(Direction.SW))
                && board.containsOppositeColor(position.next(Direction.SW), color)) {
            move.add(position.next(Direction.SW));

        } else if (board.contains(position.next(Direction.SE))
                && board.containsOppositeColor(position.next(Direction.SE), color)) {
            move.add(position.next(Direction.SE));
        }
    }

    /**
     * Give the attack move of the pawn if there is an occupation of the opposite color for White on Black
     *
     * @param position of the piece
     * @param board    of the game
     * @param color    of the piece
     * @param move     list of possible move
     */
    private void pawnAttackWhiteOnBlack(Position position, Board board, Color color, List<Position> move) {

        if (board.contains(position.next(Direction.NE))
                && board.containsOppositeColor(position.next(Direction.NE), color)
                && board.contains(position.next(Direction.NW))
                && board.containsOppositeColor(position.next(Direction.NW), color)) {
            move.add(position.next(Direction.NE));
            move.add(position.next(Direction.NW));
        } else if (board.contains(position.next(Direction.NW))
                && board.containsOppositeColor(position.next(Direction.NW), color)) {
            move.add(position.next(Direction.NW));
        } else if (board.contains(position.next(Direction.NE))
                && board.containsOppositeColor(position.next(Direction.NE), color)) {
            move.add(position.next(Direction.NE));
        }
    }

}

