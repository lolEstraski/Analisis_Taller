public class SumarBordesMatrizNCuadrada14 {
//Sumar todos los bordes de una matriz no cuadrada.

    public static void main(String[] args) {
        int[][] matriz = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
                { 10, 11, 12 }
        };

        int sumaBordes = sumarBordes(matriz, 0, 0);
        System.out.println("La suma de los bordes es: " + sumaBordes);

        int sumaBordes1 = sumarBordes1(matriz, 0, 0, 0);
        System.out.println("La suma de los bordes de la matriz es: " + sumaBordes);
    }

    static int sumarBordes(int[][] matriz, int fila, int columna) {
        if (fila >= matriz.length || columna >= matriz[0].length) {
            return 0; // Condición de salida
        }
        if (fila == 0 || fila == matriz.length - 1 || columna == 0 || columna == matriz[0].length - 1) {
            return matriz[fila][columna] + sumarBordes(matriz, fila, columna + 1);
        }
        return sumarBordes(matriz, fila + 1, columna);
    }

    public static int sumarBordes1(int[][] matriz, int filaActual, int columnaActual, int suma) {
        if (filaActual >= matriz.length || columnaActual >= matriz[0].length) {
            return suma; // Caso base: Se llegó al final de la matriz
        }
        if (filaActual == 0 || filaActual == matriz.length - 1 || columnaActual == 0
                || columnaActual == matriz[0].length - 1) {
            suma += matriz[filaActual][columnaActual];
        }
        return sumarBordes1(matriz, filaActual + 1, columnaActual, suma) +
                sumarBordes1(matriz, filaActual, columnaActual + 1, suma);
    }
}
