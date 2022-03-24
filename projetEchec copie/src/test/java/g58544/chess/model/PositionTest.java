package g58544.chess.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lovnka
 */
public class PositionTest {

    public PositionTest() {
    }

    /**
     * Test of next method, of North West direction.
     */
    @Test
    public void testNW() {
        System.out.println("North West");
        Direction dir = Direction.NW;
        Position instance = new Position(4, 2);
        Position expResult = new Position(5, 1);
        Position result = instance.next(dir);
        assertEquals(expResult, result);
    }
    
    
    /**
     * Test of next method, of North direction.
     */
    @Test
    public void testN() {
        System.out.println("North");
        Direction dir = Direction.N;
        Position instance = new Position(4, 2);
        Position expResult = new Position(5, 2);
        Position result = instance.next(dir);
        assertEquals(expResult, result);
    }

    /**
     * Test of next method, of NE direction.
     */
    @Test
    public void testNE() {
        System.out.println("North East");
        Direction dir = Direction.NE;
        Position instance = new Position(4, 2);
        Position expResult = new Position(5, 3);
        Position result = instance.next(dir);
        assertEquals(expResult, result);
    }

    /**
     * Test of next method, of West direction.
     */
    @Test
    public void testW() {
        System.out.println("West");
        Direction dir = Direction.W;
        Position instance = new Position(4, 2);
        Position expResult = new Position(4, 1);
        Position result = instance.next(dir);
        assertEquals(expResult, result);
    }

    /**
     * Test of next method, of East direction.
     */
    @Test
    public void testE() {
        System.out.println("East");
        Direction dir = Direction.E;
        Position instance = new Position(4, 2);
        Position expResult = new Position(4, 3);
        Position result = instance.next(dir);
        assertEquals(expResult, result);
    }

    /**
     * Test of next method, of South West direction.
     */
    @Test
    public void testSW() {
        System.out.println("South west");
        Direction dir = Direction.SW;
        Position instance = new Position(4, 2);
        Position expResult = new Position(3, 1);
        Position result = instance.next(dir);
        assertEquals(expResult, result);
    }

    /**
     * Test of next method, of South direction.
     */
    @Test
    public void testS() {
        System.out.println("South");
        Direction dir = Direction.S;
        Position instance = new Position(4, 2);
        Position expResult = new Position(3, 2);
        Position result = instance.next(dir);
        assertEquals(expResult, result);
    }

    /**
     * Test of next method, of South East direction.
     */
    @Test
    public void testSE() {
        System.out.println("South East");
        Direction dir = Direction.SE;
        Position instance = new Position(4, 2);
        Position expResult = new Position(3, 3);
        Position result = instance.next(dir);
        assertEquals(expResult, result);
    }

}
