import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        //runEjerciciosPD();
        runMaze();
        

    }

    private static void runEjerciciosPD(){
        EjerciciosPD ejerciciosPD = new EjerciciosPD();
        System.out.println("Fibonaci Recursivo");
        long start = System.nanoTime();
        long resultado = ejerciciosPD.getFibonacci(100);
        long end = System.nanoTime();
        long duration = end - start;
        System.out.println("Resultado = "+resultado+" en tiempo = "+duration);

        System.out.println("Fibonaci Recursivo Catching");
        start = System.nanoTime();
        resultado = ejerciciosPD.getFibonacciPD(100);
        end = System.nanoTime();
        duration = end - start;
        System.out.println("Resultado = "+resultado+" en tiempo = "+duration);
    }

    private static void runMaze(){
        boolean[][] predefinedMaze = {
            {true, true, true, true},
            {false, true, true, true},
            {true, true, false, false},
            {true, true, true, true}
        };
        /// CLASE MAZE con variable
        Maze maze = new Maze(predefinedMaze);
        System.out.println("Laberinto cargado");
        maze.printMaze();

        Cell start = new Cell(0, 0);
        Cell end = new Cell(3, 3);

        List<MazeSolver> solvers = Arrays.asList(
            new MazeSolverRecursivo(),
             new MazeSolverRecursivoCompletoBT()
            // new MazeSolverBFS(),
            // new MazeSolverDFS()
        );
        MazeSolver solver = solvers.get(1);
        List<Cell>path;
        path = solver.getPath(maze.getGrid(), start, end);
        System.out.println(path);

    }
}
