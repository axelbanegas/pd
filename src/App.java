
public class App {
    public static void main(String[] args) throws Exception {
        
        runEjerciciosPD();
        runEjerciciosPD();

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
}
