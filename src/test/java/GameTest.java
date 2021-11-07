import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Assert;
public class GameTest {


    Board board = new Board(4, 8);



    @Test
    public void foundsNoLivingNeighboursInAnEmptyGrid() {

        int neighboursCount = board.countAliveNeighbours(1, 4);
   Assert.assertEquals(neighboursCount, 0) ;

    }

    @Test
    public void foundsOneLivingNeighbour() {

        board.setAliveCell(0, 3);

        int neighboursCount = board.countAliveNeighbours(1, 4);

        Assert.assertEquals(neighboursCount, 1);
    }



//    @Test
//    public void LiveCellWithLessThanTwoLiveNeighborsDies() {
//        GameOfLife.CellState currentState = GameOfLife.CellState.isAlive;
//        int aliveNeighbors = 1;
//        GameOfLife.CellState result = GameOfLife.GameRules.NewCellState(currentState, aliveNeighbors);
//        assertEquals(GameOfLife.CellState.isDead, result);
//    }
//    @Test
//    public void LiveCellLessThanTwoLiveNeighborsDies() {
//        GameOfLife.CellState currentState = GameOfLife.CellState.isAlive;
//        int aliveNeighbors = 1;
//        GameOfLife.CellState result = GameOfLife.GameRules.NewCellState(currentState, aliveNeighbors);
//        assertEquals(GameOfLife.CellState.isDead, result);
//    }
//    @Test
//    public void LiveCellWith0LiveNeighborsDies() {
//        GameOfLife.CellState currentState = GameOfLife.CellState.isAlive;
//        int aliveNeighbors = 0;
//        GameOfLife.CellState result = GameOfLife.GameRules.NewCellState(currentState, aliveNeighbors);
//        assertEquals(GameOfLife.CellState.isDead, result);
//    }
//    @Test
//    public void LiveCellWithMoreThanThreeNeighborsDies() {
//        GameOfLife.CellState currentState = GameOfLife.CellState.isAlive;
//        int aliveNeighbors = 4;
//        GameOfLife.CellState result = GameOfLife.GameRules.NewCellState(currentState, aliveNeighbors);
//        assertEquals(GameOfLife.CellState.isDead, result);
//    }
//    @Test
//    public void DeadCellWithExactlyThreeLiveNeighborsLives() {
//        GameOfLife.CellState currentState = GameOfLife.CellState.isDead;
//        int aliveNeighbors = 3;
//        GameOfLife.CellState result = GameOfLife.GameRules.NewCellState(currentState, aliveNeighbors);
//        assertEquals(GameOfLife.CellState.isAlive, result);
//    }



}

