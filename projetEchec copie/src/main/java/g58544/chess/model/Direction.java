package g58544.chess.model;

/**
 *
 * @author AimeNka
 */
public enum Direction {
    NW(1, -1),
    N(1, 0),
    NE(1, 1),
    W(0, -1),
    E(0, 1),
    SW(-1, -1),
    S(-1, 0),
    SE(-1, 1);

    private int deltaRow;
    private int deltaColumn;

    /**
     * Constructor row and column direction.
     * @param deltaRow value
     * @param deltaColumn value
     */
    Direction(int deltaRow, int deltaColumn) {
        this.deltaRow = deltaRow;
        this.deltaColumn = deltaColumn;
    }

    /**
     * Getter for row direction.
     * @return row value
     */
    public int getDeltaRow() {
        return deltaRow;
    }

    /**
     * Getter for column direction.
     * @return column value
     */
    public int getDeltaColumn() {
        return deltaColumn;
    }
}
