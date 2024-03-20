public class MultplicacionMatriz17 {
//Multiplicar dos matrices (no necesariamente cuadradas).

    public static void main(String[] args) {
        int[][] matrizA = {{1, 2, 9}, {4, 5, 6}};
        int[][] matrizB = {{7, 8}, {9, 5}, {11, 2}};

        int[][] resultado = multiplicarMatrices(matrizA, matrizB);

        // Imprimir el resultado
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[0].length; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] multiplicarMatrices(int[][] A, int[][] B) {
        int filasA = A.length;
        int columnasA = A[0].length;
        int columnasB = B[0].length;

        int[][] resultado = new int[filasA][columnasB];

        // Llamada a la función recursiva
        multiplicarMatricesRecursivo(A, B, resultado, 0, 0, 0);

        return resultado;
    }

    public static void multiplicarMatricesRecursivo(int[][] A, int[][] B, int[][] resultado, int filaA, int columnaB, int k) {
        // Caso base: si se han procesado todas las filas de A
        if (filaA == A.length) {
            return;
        }

        // Caso iterativo: si se ha procesado una columna completa de B
        if (columnaB == B[0].length) {
            multiplicarMatricesRecursivo(A, B, resultado, filaA + 1, 0, 0);
            return;
        }

        // Caso iterativo: si se ha procesado un elemento de la fila de A y una columna de B
        if (k == A[0].length) {
            multiplicarMatricesRecursivo(A, B, resultado, filaA, columnaB + 1, 0);
            return;
        }

        // Cálculo del resultado y llamada recursiva
        resultado[filaA][columnaB] += A[filaA][k] * B[k][columnaB];
        multiplicarMatricesRecursivo(A, B, resultado, filaA, columnaB, k + 1);
    }
}
