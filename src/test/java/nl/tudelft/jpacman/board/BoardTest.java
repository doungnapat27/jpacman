package nl.tudelft.jpacman.board;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
/***
 * This is test cases for board class.
 */

public class BoardTest {

    /**
     * This is a set up method.
     */
    private Board board;

    /***
     * This is the set up section for initiate the environment.
     */
    @BeforeEach
    void setUp() {
        Square[][] grid = new Square[1][1];
        grid[0][0] = new BasicSquare();
        board = new Board(grid);
    }

    /***
     * Test board not null method.
     */
    @Test
    void testBoardNotNull() {
        assertThat(board).isNotNull();
    }

    /***
     * Test board dimension method.
     */
    @Test
    void testBoardDimension() {
        assertThat(board.getHeight()).isEqualTo(1);
        assertThat(board.getWidth()).isEqualTo(1);
    }

    /***
     * Test basic square method.
     */
    @Test
    void testBasicSquare() {
        assertThat(board.squareAt(0, 0) instanceof BasicSquare).isTrue();
    }

    /***
     * Test invariant method.
     */
    @Test
    void testInvariant() {
        assertThat(board.invariant()).isTrue();
    }

    /***
     * Test within borders method.
     */
    @Test
    void testWithinBorders() {
        assertThat(board.withinBorders(0, 0)).isTrue();
    }
}
