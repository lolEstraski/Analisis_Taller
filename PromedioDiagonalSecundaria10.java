public class PromedioDiagonalSecundaria10 {
//Hallar el promedio de los elementos de la diagonal secundaria de una matriz cuadrada.

    public static void main(String[] args) {
        int[][] matriz = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        double promedio = calcularPromedioDiagonalSecundaria(matriz, matriz.length - 1, 0, 0, 0);
        System.out.println("Promedio de la diagonal secundaria: " + promedio);

        double promedio1 = calcularPromedioDiagonalSecundaria(matriz, matriz.length);
        System.out.println("El promedio de la diagonal secundaria es: " + promedio1);
    }


    public static double calcularPromedioDiagonalSecundaria(int[][] matriz, int fila, int columna, double suma,
            int contador) {
        if (fila < 0 || columna >= matriz.length) {
            return suma / contador;
        }

        suma += matriz[fila][columna];
        contador++;

        return calcularPromedioDiagonalSecundaria(matriz, fila - 1, columna + 1, suma, contador);
    }

    // otro metodo
    public static double calcularPromedioDiagonalSecundaria(int[][] matriz, int n) {
        if (n <= 0) {
            return 0.0; // Caso base: Matriz vacía o de un solo elemento
        }
        return (matriz[n - 1][0] + calcularPromedioDiagonalSecundaria(matriz, n - 1)) / n;
    }
}
