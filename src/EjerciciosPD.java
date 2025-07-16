import java.util.Map;
public class EjerciciosPD {

	public long getFibonacciPD(long n) {
		long fib = 0;
		long fib2 = 1;
		for (int i = 0; i < n; i++) {
			fib = fib + fib2;
			fib2 = fib - fib2;
		}
		return fib;
	}
    public long getFibonacci(long n) {
    if (n <= 1) return n;
    return getFibonacci(n - 1) + getFibonacci(n - 2);
}

    private Long getFibonacciPDHelper(int n, Map<Integer, Long> mapa) {
        if (mapa.containsKey(n)) {
            return mapa.get(n);
        }
        if (n == 0) {
            return 0L;
        }
        if (n == 1) {
            return 1L;
        }
        Long fib = getFibonacciPDHelper(n - 1, mapa);
        Long fib2 = getFibonacciPDHelper(n - 2, mapa);
        mapa.put(n, fib + fib2);
        return mapa.get(n);
    }

}