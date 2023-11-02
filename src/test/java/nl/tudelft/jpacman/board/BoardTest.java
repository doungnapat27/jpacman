package nl.tudelft.jpacman.board;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
/***
 * This is test cases for board class
 */

public class BoardTest {

    /**
     * set Up 
     */
    private Board board;
    @BeforeEach
    void setUp() {
        Square[][] grid = new Square[1][1];
        grid[0][0] = new BasicSquare();
        board = new Board(grid);
    }

    /***
     * test board not null
     */
    @Test
    void testBoardNotNull() {
        assertThat(board).isNotNull();
    }

    /***
     * test board dimension
     */
    @Test
    void testBoardDimension() {
        assertThat(board.getHeight()).isEqualTo(1);
        assertThat(board.getWidth()).isEqualTo(1);
    }

    /***
     * test basic square
     */
    @Test
    void testBasicSquare() {
        assertThat(board.squareAt(0, 0) instanceof BasicSquare).isTrue();
    }

    /***
     * test invariant
     */
    @Test
    void testInvariant() {
        assertThat(board.invariant()).isTrue();
    }

    /***
     * test within borders
     */
    @Test
    void testWithinBorders() {
        assertThat(board.withinBorders(0, 0)).isTrue();
    }

    /***
     * test square
     */
    @Test
    void testSquareAtNull() {
        Square[][] grid = new Square[1][1];
        Board board = new Board(grid);
        assertThat(board.squareAt(0, 0)).isNull();
    }
}
