import java.util.List;
import java.util.ArrayList;

public class MazeSolverRecursivo implements MazeSolver {
    
    public List<Cell> getPath(boolean[][] grid, Cell start, Cell end){
        if(grid == null || grid.length == 0){
            return new ArrayList<>();
        }
        List<Cell> path = new ArrayList<>();
        if (findPath(grid, start, end, path)){
            return path;
        }

        return null;
    }

    private boolean findPath(boolean[][] grid, Cell start, Cell end, List<Cell> path){
        // valido si la celda de inicio su fila esta dentro de mi grind
        // valido si la grow esta dentro de mi grind
        // valido di la celda es transitable == true
        int row = start.getRow();
        int col = start.getCol();
        if (row >= grid.length || col >= grid[0].length ||  !grid[row][col] ) {
            return false;
        }
        // Validar si es el final
        if ( row == end.row && col == end.col){
            path.add(start);
            return true;
        }
         
        if (findPath(grid, new Cell(row + 1, col), end, path)){
            path.add(start);
            return true;
        }
        // DERECHA NO EN
        if (findPath(grid, new Cell(row, col + 1), end, path)){
            path.add(start);
            return true;
        }
        return false;
        }
    }
        
      

