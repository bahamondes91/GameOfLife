public class Board {
    int width;
    int height;
    int[][] board;

    public Board(int width, int height) {
        this.width = width;
        this.height = height;
        this.board = new int[width][height];
    }

    public void setAliveCell(int x, int y) {
        this.board[x][y] = 1;
    }

    public void setDeadCell(int x, int y) {
        this.board[x][y] = 0;

    }

    public void printBoard() {
        for (int y = 0; y < height; y++) {
            String line = "|";
            for (int x = 0; x < width; x++) {
                if (this.board[x][y] == 0)
                    line += "-";
                else
                    line += "*";
            }
            line += "|";
            System.out.println(line);
        }

    }

    public int isAlive(int x, int y) {
        if (x < 0 || x >= width) {
            return 0;
        }
        if (y < 0 || y >= height) {
            return 0;
        }
        return this.board[x][y];
    }

    public void nextGeneration() {
        int[][] newBoard = new int[width][height];

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int aliveNeighbours = countAliveNeighbours(x, y);

                if (isAlive(x, y) == 1) {
                    if (aliveNeighbours < 2) {
                        newBoard[x][y] = 0;
                    } else if (aliveNeighbours == 2) {
                        newBoard[x][y] = 1;
                    } else if (aliveNeighbours > 3) {
                        newBoard[x][y] = 0;
                    }
                } else {
                    if (aliveNeighbours == 3) {
                        newBoard[x][y] = 1;
                    }
                }

            }
        }
        this.board = newBoard;
    }

    public int countAliveNeighbours(int x, int y) {
        int count = 0;
        count += isAlive(x - 1, y - 1);
        count += isAlive(x, y - 1);
        count += isAlive(x + 1, y - 1);

        count += isAlive(x - 1, y);
        count += isAlive(x + 1, y);

        count += isAlive(x - 1, y + 1);
        count += isAlive(x, y + 1);
        count += isAlive(x + 1, y + 1);

        return count;

    }


}
