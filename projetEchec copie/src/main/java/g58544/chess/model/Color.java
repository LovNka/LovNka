package g58544.chess.model;

import java.util.Collections;

/**
 *
 * @author AimeNka
 */
public enum Color {
    BLACK, WHITE;
    
    /**
     * Return the opposite color.
     * @return color
     */
    public Color opposite(){  
        return switch (this){
            case WHITE -> BLACK;
            default -> WHITE;
        };
    }
}
