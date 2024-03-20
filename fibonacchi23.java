public class fibonacchi23 {

    //Dado un ArrayList de enteros, retornar los valores contenidos en él que hacen parte de la serie Fibonacci.
    // La serie Fibonacci comienza en 0,1 y los siguientes términos se calculan sumando los dos números anteriores.
    //  Ejemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610

    public static void main(String[] args) {
        fibonacchi23 main = new fibonacchi23();
        int n = 35; // Número para calcular su término en la serie Fibonacci
        int resultado = main.fibonacciMejorado(n);
        System.out.println("El término " + n + " de la serie Fibonacci es: " + resultado);
    }

    public int fibonacciMejorado(int n) {
        return fibonacciAux(n, 2, 0, 1);
    }

    private int fibonacciAux(int n, int i, int a, int b) {
        if (n == i) {
            return a + b;
        } else {
            return fibonacciAux(n, i + 1, b, a + b);
        }
    }
}
