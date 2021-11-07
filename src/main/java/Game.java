
public class Game {
    public static void main(String[] args) {

        Board board = new Board(8,5);
        board.setAliveCell(2,2);
        board.setAliveCell(3,2);
        board.setAliveCell(4,2);

        System.out.println("First Generation");
        board.printBoard();
        board.nextGeneration();
        System.out.println("Next Generation");
        board.printBoard();
    }
}