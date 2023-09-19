package nl.tudelft.jpacman.board;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BoardTest {

    private Board board;
    @BeforeEach
    void setUp() {
        Square[][] grid = new Square[1][1];
        grid[0][0] = new BasicSquare();
        board = new Board(grid);
    }
    @Test
    void TestBoardNotNull(){
        assertThat(board).isNotNull();
    }

    @Test
    void TestBoardDimension(){
        assertThat(board.getHeight()).isEqualTo(1);
        assertThat(board.getWidth()).isEqualTo(1);
    }
    @Test
    void TestBasicSquare(){
        assertThat(board.squareAt(0,0) instanceof BasicSquare).isTrue();
    }
    @Test
    void TestInvariant(){
        assertThat(board.invariant()).isTrue();
    }
    @Test
    void TestWithinBorders(){
        assertThat(board.withinBorders(0,0)).isTrue();
    }

    @Test
    void TestSquareAtNull(){
        Square[][] grid = new Square[1][1];
        Board board = new Board(grid);
        assertThat(board.squareAt(0,0)).isNull();
    }
}
