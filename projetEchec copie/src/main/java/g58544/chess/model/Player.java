package g58544.chess.model;

/**
 *
 * @author AimeNka
 */
public class Player {
    
    private Color color;

    /**
     * Constructor for the player with the color
     * @param color of the piece
     */
    public Player(Color color) {
        this.color = color;
    }

    /**
     * Getter the color of the player
     * @return color
     */
    public Color getColor() {
        return color;
    }
    
}
