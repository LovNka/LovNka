package g58544.chess.model;


import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author srexhep
 */
public class PieceTest {
    
    Board board;
    
    public PieceTest() {
    }
    
    @BeforeEach
    public void setUp() {
        board = new Board();
    }


    @Test
    public void testGetPossibleMovesPawnWhitePos1_1() {
        Position position = new Position(1,1);
        Piece piece = new Piece(Color.WHITE);
        board.setPiece(piece, position);

        List<Position> expected = List.of(
                new Position(2, 1),
                new Position(3, 1)
        );

        List<Position> positions = piece.getPossibleMoves(position, board);

        assertEqualsIgnoringOrder(expected, positions);
    }

    @Test
    public void testGetPossibleMovesPawnWhitePos6_0() {
        Position position = new Position(6,0);
        Piece piece = new Piece(Color.WHITE);
        board.setPiece(piece, position);

        List<Position> expected = List.of(
                new Position(7, 0)
        );

        List<Position> positions = piece.getPossibleMoves(position, board);

        assertEqualsIgnoringOrder(expected, positions);
    }

    @Test
    public void testGetPossibleMovesPawnWhitePos6_1() {
        Position position = new Position(6,1);
        Piece piece = new Piece(Color.WHITE);
        board.setPiece(piece, position);

        List<Position> expected = List.of(
                new Position(7, 1)
        );

        List<Position> positions = piece.getPossibleMoves(position, board);

        assertEqualsIgnoringOrder(expected, positions);
    }

    @Test
    public void testGetPossibleMovesPawnWhitePos5_1() {
        Position position = new Position(5,1);
        Piece piece = new Piece(Color.WHITE);
        Position positionOpponent = new Position(6,1);
        Piece pieceOpponent = new Piece(Color.BLACK);
        board.setPiece(piece, position);
        board.setPiece(pieceOpponent,positionOpponent);

        List<Position> expected = List.of();

        List<Position> positions = piece.getPossibleMoves(position, board);

        assertEqualsIgnoringOrder(expected, positions);
    }

    @Test
    public void testGetPossibleMovesPawnWhitePos2_2() {
        Position position = new Position(2,2);
        Piece piece = new Piece(Color.WHITE);
        Position positionOpponent = new Position(3,3);
        Position positionOpponent2 = new Position(3,1);
        Position positionOpponent3 = new Position(3,2);
        Piece pieceOpponent = new Piece(Color.WHITE);
        board.setPiece(piece, position);
        board.setPiece(pieceOpponent,positionOpponent);
        board.setPiece(pieceOpponent,positionOpponent2);
        board.setPiece(pieceOpponent,positionOpponent3);
        List<Position> expected = List.of();

        List<Position> positions = piece.getPossibleMoves(position, board);

        assertEqualsIgnoringOrder(expected, positions);
    }

    @Test
    public void testGetPossibleMovesPawnWhitePos1_2() {
        Position position = new Position(1,2);
        Piece piece = new Piece(Color.WHITE);
        Position positionOpponent = new Position(2,3);
        Position positionOpponent2 = new Position(2,1);
        Position positionOpponent3 = new Position(2,2);
        Piece pieceOpponent = new Piece(Color.WHITE);
        board.setPiece(piece, position);
        board.setPiece(pieceOpponent,positionOpponent);
        board.setPiece(pieceOpponent,positionOpponent2);
        board.setPiece(pieceOpponent,positionOpponent3);
        List<Position> expected = List.of();

        List<Position> positions = piece.getPossibleMoves(position, board);

        assertEqualsIgnoringOrder(expected, positions);
    }

    @Test
    public void testGetPossibleMovesPawnWhitePosMaxBorder3_7() {
        Position position = new Position(3,7);
        Piece piece = new Piece(Color.WHITE);
        board.setPiece(piece, position);

        List<Position> expected = List.of(
                new Position(4, 7)
        );

        List<Position> positions = piece.getPossibleMoves(position, board);

        assertEqualsIgnoringOrder(expected, positions);
    }

    @Test
    public void testGetPossibleMovesPawnWhiteAttackMaxBorder3_7() {
        Position position = new Position(3,7);
        Piece piece = new Piece(Color.WHITE);
        Position positionOpponent = new Position(4,6);
        Piece pieceOpponent = new Piece(Color.BLACK);
        board.setPiece(pieceOpponent,positionOpponent);
        board.setPiece(piece, position);

        List<Position> expected = List.of(
                new Position(4, 7),
                new Position(4, 6)
        );

        List<Position> positions = piece.getPossibleMoves(position, board);

        assertEqualsIgnoringOrder(expected, positions);
    }

    @Test
    public void testGetPossibleMovesPawnWhitePosMinBorder2_0() {
        Position position = new Position(2,0);
        Piece piece = new Piece(Color.WHITE);
        board.setPiece(piece, position);
        List<Position> expected = List.of(
                new Position(3, 0)
        );

        List<Position> positions = piece.getPossibleMoves(position, board);

        assertEqualsIgnoringOrder(expected, positions);
    }

    @Test
    public void testGetPossibleMovesPawnWhiteAttackMinBorder2_0() {
        Position position = new Position(2,0);
        Piece piece = new Piece(Color.WHITE);
        Position positionOpponent = new Position(3,1);
        Piece pieceOpponent = new Piece(Color.BLACK);
        board.setPiece(piece, position);
        board.setPiece(pieceOpponent,positionOpponent);
        List<Position> expected = List.of(
                new Position(3, 0),
                new Position(3,1)
        );

        List<Position> positions = piece.getPossibleMoves(position, board);

        assertEqualsIgnoringOrder(expected, positions);
    }

    @Test
    public void testGetPossibleMovesPawnWhiteAttack3_5() {
        Position position = new Position(3,5);
        Piece piece = new Piece(Color.WHITE);
        Position positionOpponent = new Position(4,6);
        Piece pieceOpponent = new Piece(Color.BLACK);
        board.setPiece(piece, position);
        board.setPiece(pieceOpponent,positionOpponent);
        List<Position> expected = List.of(
                new Position(4, 5),
                new Position(4,6)
        );

        List<Position> positions = piece.getPossibleMoves(position, board);

        assertEqualsIgnoringOrder(expected, positions);
    }

    @Test
    public void testGetPossibleMovesPawnWhitePosAttack1_3() {
        Position position = new Position(1,3);
        Piece piece = new Piece(Color.WHITE);
        Position positionOpponent = new Position(2,3);
        Position positionOpponent2 = new Position(2,2);
        Position positionOpponent3 = new Position(2,4);
        Piece pieceOpponent = new Piece(Color.BLACK);
        board.setPiece(piece, position);
        board.setPiece(pieceOpponent,positionOpponent);
        board.setPiece(pieceOpponent,positionOpponent2);
        board.setPiece(pieceOpponent,positionOpponent3);
        List<Position> expected = List.of(
                new Position(2, 2),
                new Position(2,4)
        );

        List<Position> positions = piece.getPossibleMoves(position, board);

        assertEqualsIgnoringOrder(expected, positions);
    }

    @Test
    public void testGetPossibleMovesPawnWhitePosAttack4_2() {
        Position position = new Position(4,2);
        Piece piece = new Piece(Color.WHITE);
        Position positionOpponent = new Position(5,3);
        Position positionOpponent2 = new Position(5,1);
        Position positionOpponent3 = new Position(5,2);
        Piece pieceOpponent = new Piece(Color.BLACK);
        board.setPiece(piece, position);
        board.setPiece(pieceOpponent,positionOpponent);
        board.setPiece(pieceOpponent,positionOpponent2);
        board.setPiece(pieceOpponent,positionOpponent3);
        List<Position> expected = List.of(
                new Position(5, 3),
                new Position(5,1)
        );

        List<Position> positions = piece.getPossibleMoves(position, board);

        assertEqualsIgnoringOrder(expected, positions);
    }

    @Test
    public void testGetPossibleIllegalMovesPawnWhite2_8() {
        try {
            Position position = new Position(2,8);
            Piece piece = new Piece(Color.WHITE);
            board.setPiece(piece, position);

            fail();
        } catch (IllegalArgumentException expected) {
            assertEquals("The position must be between 0 and 7 for Row an Column", expected.getMessage());
        }
    }



    @Test
    public void testGetPossibleMovesPawnBlackPos6_1() {
        Position position = new Position(6,1);
        Piece piece = new Piece(Color.BLACK);
        board.setPiece(piece, position);

        List<Position> expected = List.of(
                new Position(5, 1),
                new Position(4, 1)
        );

        List<Position> positions = piece.getPossibleMoves(position, board);

        assertEqualsIgnoringOrder(expected, positions);
    }

    @Test
    public void testGetPossibleMovesPawnBlackPos1_1() {
        Position position = new Position(1,1);
        Piece piece = new Piece(Color.BLACK);
        board.setPiece(piece, position);

        List<Position> expected = List.of(
                new Position(0, 1)
        );

        List<Position> positions = piece.getPossibleMoves(position, board);

        assertEqualsIgnoringOrder(expected, positions);
    }

    @Test
    public void testGetPossibleMovesPawnBackPos2_1() {
        Position position = new Position(2,1);
        Piece piece = new Piece(Color.BLACK);
        Position positionOpponent = new Position(1,1);
        Piece pieceOpponent = new Piece(Color.WHITE);
        board.setPiece(piece, position);
        board.setPiece(pieceOpponent,positionOpponent);

        List<Position> expected = List.of();

        List<Position> positions = piece.getPossibleMoves(position, board);

        assertEqualsIgnoringOrder(expected, positions);
    }

    @Test
    public void testGetPossibleMovesPawnBlackPos4_2() {
        Position position = new Position(4,2);
        Piece piece = new Piece(Color.BLACK);
        Position positionOpponent = new Position(3,3);
        Position positionOpponent2 = new Position(3,1);
        Position positionOpponent3 = new Position(3,2);
        Piece pieceOpponent = new Piece(Color.BLACK);
        board.setPiece(piece, position);
        board.setPiece(pieceOpponent,positionOpponent);
        board.setPiece(pieceOpponent,positionOpponent2);
        board.setPiece(pieceOpponent,positionOpponent3);
        List<Position> expected = List.of();

        List<Position> positions = piece.getPossibleMoves(position, board);

        assertEqualsIgnoringOrder(expected, positions);
    }

    @Test
    public void testGetPossibleMovesPawnBlackPos3_3() {
        Position position = new Position(3,3);
        Piece piece = new Piece(Color.BLACK);
        board.setPiece(piece, position);

        List<Position> expected = List.of(
                new Position(2, 3)
        );

        List<Position> positions = piece.getPossibleMoves(position, board);

        assertEqualsIgnoringOrder(expected, positions);
    }

    @Test
    public void testGetPossibleMovesPawnBlackPosMaxBorder3_7() {
        Position position = new Position(3,7);
        Piece piece = new Piece(Color.BLACK);
        board.setPiece(piece, position);

        List<Position> expected = List.of(
                new Position(2, 7)
        );

        List<Position> positions = piece.getPossibleMoves(position, board);

        assertEqualsIgnoringOrder(expected, positions);
    }

    @Test
    public void testGetPossibleMovesPawnBlackAttackMaxBorder3_7() {
        Position position = new Position(3,7);
        Piece piece = new Piece(Color.BLACK);
        Position positionOpponent = new Position(2,6);
        Piece pieceOpponent = new Piece(Color.WHITE);
        board.setPiece(piece, position);
        board.setPiece(pieceOpponent,positionOpponent);
        List<Position> expected = List.of(
                new Position(2, 7),
                new Position(2, 6)
        );

        List<Position> positions = piece.getPossibleMoves(position, board);

        assertEqualsIgnoringOrder(expected, positions);
    }

    @Test
    public void testGetPossibleMovesPawnBlackAttackMinBorder2_0() {
        Position position = new Position(2,0);
        Piece piece = new Piece(Color.BLACK);
        Position positionOpponent = new Position(1,1);
        Piece pieceOpponent = new Piece(Color.WHITE);
        board.setPiece(piece, position);
        board.setPiece(pieceOpponent,positionOpponent);
        List<Position> expected = List.of(
                new Position(1, 0),
                new Position(1,1)
        );

        List<Position> positions = piece.getPossibleMoves(position, board);

        assertEqualsIgnoringOrder(expected, positions);
    }

    @Test
    public void testGetPossibleMovesPawnBlackPosMinBorder2_0() {
        Position position = new Position(2,0);
        Piece piece = new Piece(Color.BLACK);
        board.setPiece(piece, position);
        List<Position> expected = List.of(
                new Position(1, 0)
        );

        List<Position> positions = piece.getPossibleMoves(position, board);

        assertEqualsIgnoringOrder(expected, positions);
    }

    @Test
    public void testGetPossibleMovesPawnBlackPosAttack3_5() {
        Position position = new Position(3,5);
        Piece piece = new Piece(Color.BLACK);
        Position positionOpponent = new Position(2,4);
        Piece pieceOpponent = new Piece(Color.WHITE);
        board.setPiece(piece, position);
        board.setPiece(pieceOpponent,positionOpponent);
        List<Position> expected = List.of(
                new Position(2, 5),
                new Position(2,4)
        );

        List<Position> positions = piece.getPossibleMoves(position, board);

        assertEqualsIgnoringOrder(expected, positions);
    }

    @Test
    public void testGetPossibleMovesPawnBlackPosAttack1_3() {
        Position position = new Position(1,3);
        Piece piece = new Piece(Color.BLACK);
        Position positionOpponent = new Position(0,2);
        Position positionOpponent2 = new Position(0,3);
        Position positionOpponent3 = new Position(0,4);
        Piece pieceOpponent = new Piece(Color.WHITE);
        board.setPiece(piece, position);
        board.setPiece(pieceOpponent,positionOpponent);
        board.setPiece(pieceOpponent,positionOpponent2);
        board.setPiece(pieceOpponent,positionOpponent3);
        List<Position> expected = List.of(
                new Position(0, 2),
                new Position(0,4)
        );

        List<Position> positions = piece.getPossibleMoves(position, board);

        assertEqualsIgnoringOrder(expected, positions);
    }

    @Test
    public void testGetPossibleIllegalMovesPawnBlack2_8() {
        try {
            Position position = new Position(-1,5);
            Piece piece = new Piece(Color.BLACK);
            board.setPiece(piece, position);

            fail();
        } catch (IllegalArgumentException expected) {
            assertEquals("The position must be between 0 and 7 for Row an Column", expected.getMessage());
        }
    }

    /*
     *      Permet de tester si deux listes de positions sont identiques à l'ordre
     *      des éléments prêts. Cette méthode est appelée
     *      par les méthodes de test.
     */
    private void assertEqualsIgnoringOrder(List<Position> expected, List<Position> actual) {
        assertEquals(expected.size(), actual.size());
        assertTrue(actual.containsAll(expected));
        assertTrue(expected.containsAll(actual));
    }

}
