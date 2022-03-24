package g58544.chess.model;

/**
 *
 * @author AimeNka
 */
public class Square {
    private Piece piece;

    /**
     * Constructor for the square position with the piece
     * @param piece the piece at the square position
     */
    public Square(Piece piece) {
        this.piece = piece;
    }

    /**
     * Getter for the piece
     * @return piece value
     */
    public Piece getPiece() {
        return piece;
    }

    /**
     * Set the piece at the square
     * @param piece at the square position
     */
    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    /**
     * Return a boolean if the square is free
     * @return true or false
     */
    public boolean isFree(){
        if (piece == null){
            return true;
        }
        return false;
    }
}
