import org.junit.Test;
import org.junit.Assert;

public class GameTest {


    Board board = new Board(4, 8);

    Board testBoard = new Board(4, 8);


    @Test
    public void noLivingNeighboursFoundInAnEmptyBoard() {

        int neighboursCount = board.countAliveNeighbours(1, 4);
        Assert.assertEquals(neighboursCount, 0);

    }

    @Test
    public void oneLivingNeighbourFound() {

        board.setAliveCell(0, 3);

        int neighboursCount = board.countAliveNeighbours(1, 4);

        Assert.assertEquals(neighboursCount, 1);
    }

    @Test
    public void twoLivingNeighboursFound() {

        board.setAliveCell(0, 3);
        board.setAliveCell(0, 4);

        int neighboursCount = board.countAliveNeighbours(1, 4);

        Assert.assertEquals(neighboursCount, 2);
    }

    @Test
    public void threeLivingNeighboursFound() {

        board.setAliveCell(0, 3);
        board.setAliveCell(0, 4);
        board.setAliveCell(0, 5);

        int neighboursCount = board.countAliveNeighbours(1, 4);

        Assert.assertEquals(neighboursCount, 3);
    }

    @Test
    public void fourLivingNeighboursFound() {

        board.setAliveCell(0, 3);
        board.setAliveCell(0, 4);
        board.setAliveCell(0, 5);
        board.setAliveCell(1, 5);

        int neighboursCount = board.countAliveNeighbours(1, 4);

        Assert.assertEquals(neighboursCount, 4);
    }

    @Test
    public void fiveLivingNeighboursFound() {

        board.setAliveCell(0, 3);
        board.setAliveCell(0, 4);
        board.setAliveCell(0, 5);
        board.setAliveCell(1, 5);
        board.setAliveCell(2, 5);

        int neighboursCount = board.countAliveNeighbours(1, 4);

        Assert.assertEquals(neighboursCount, 5);
    }


    @Test
    public void deadCellWithThreeNeighboursGetsAlive() {

        board.setAliveCell(0, 3);
        board.setAliveCell(0, 4);
        board.setAliveCell(0, 5);
        board.nextGeneration();

        testBoard.setAliveCell(1, 4);

        Assert.assertTrue(board.isCellAlive(1, 4));
    }

    @Test
    public void testNextGeneration() {

        board.setAliveCell(1, 4);
        board.setAliveCell(2, 3);
        board.setAliveCell(2, 4);

        board.nextGeneration();

        testBoard.setAliveCell(1, 3);
        testBoard.setAliveCell(2, 3);
        testBoard.setAliveCell(1, 4);
        testBoard.setAliveCell(2, 4);

        Assert.assertArrayEquals(board.board, testBoard.board);

    }
}

