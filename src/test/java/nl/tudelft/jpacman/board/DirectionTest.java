package nl.tudelft.jpacman.board;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * A very simple (and not particularly useful)
 * test class to have a starting point where to put tests.
 *
 * @author Arie van Deursen
 */
public class DirectionTest {
    /**
     * Do we get the correct delta when moving north?
     */
    @Test
    void testNorth() {
        Direction north = Direction.valueOf("NORTH");
        assertThat(north.getDeltaY()).isEqualTo(-1);
    }
    /***
     * Test the move method(North).
     */
    @Test
    void testNorth2() {
        Direction north = Direction.valueOf("NORTH");
        assertThat(north.getDeltaX()).isEqualTo(0);
    }
    /***
     * Test the move method(South).
     */
    @Test
    void testSouth() {
        Direction south = Direction.valueOf("SOUTH");
        assertThat(south.getDeltaY()).isEqualTo(1);
    }
    /***
     * Test the move method(South2).
     */
    @Test
    void testSouth2() {
        Direction south = Direction.valueOf("SOUTH");
        assertThat(south.getDeltaX()).isEqualTo(0);
    }
    /***
     * Test the move method(East).
     */
    @Test
    void testEast() {
        Direction east = Direction.valueOf("EAST");
        assertThat(east.getDeltaX()).isEqualTo(1);
    }
    /***
     * Test the move method(East2).
     */
    @Test
    void testEast2() {
        Direction east = Direction.valueOf("EAST");
        assertThat(east.getDeltaY()).isEqualTo(0);
    }
    /***
     * Test the move method(West).
     */
    @Test
    void testWest() {
        Direction west = Direction.valueOf("WEST");
        assertThat(west.getDeltaX()).isEqualTo(-1);
    }
    /***
     * Test the move method(West2).
     */
    @Test
    void testWest2() {
        Direction west = Direction.valueOf("WEST");
        assertThat(west.getDeltaY()).isEqualTo(0);
    }
}
