import java.util.List;
public interface MazeSolver {
    //va a tener un metodo que me devuelva 
    List<Cell> getPath(boolean[][] grid, Cell start, Cell end);
}
