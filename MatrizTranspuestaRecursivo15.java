public class MatrizTranspuestaRecursivo15 {
//Obtener la matriz transpuesta de una matriz.

    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        }; 

        int[][] matrizTranspuesta = obtenerMatrizTranspuesta(matriz, 0, 0);
        imprimirMatriz(matrizTranspuesta);
    }

    static int[][] obtenerMatrizTranspuesta(int[][] matriz, int fila, int columna) {
        if (fila >= matriz.length) {
            return new int[matriz[0].length][matriz.length]; // Condición de salida
        }
        int[][] matrizTranspuesta = obtenerMatrizTranspuesta(matriz, fila + 1, columna);
        for (int i = 0; i < matriz[0].length; i++) {
            matrizTranspuesta[i][fila] = matriz[fila][i];
        }
        return matrizTranspuesta;
    }

    static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
