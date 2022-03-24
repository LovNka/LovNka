package g58544.chess.model;

import java.util.Objects;


/**
 *
 * @author AimeNka
 */
public class Position {

    private int row;
    private int column;
    
    /**
     * Constructor for position of row and column.
     * @param row value
     * @param column value
     */
    public Position(int row, int column) {    
        this.row = row;
        this.column = column;
    }

    /**
     * Getter for row position.
     * @return row value
     */
    public int getRow() {
        return row;
    }

    /**
     * Getter for column position
     * @return column position
     */
    public int getColumn() {
        return column;
    }

    /**
     * Return the new position of the object.
     * @param dir The direction to go
     * @return The new direction
     */
    public Position next(Direction dir){
        int dRow = dir.getDeltaRow();
        int dColumn = dir.getDeltaColumn();
        return new Position((this.row + dRow),(this.column + dColumn));
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Position other = (Position) obj;
        
        return row == other.row && column == other.column;
    }
}
