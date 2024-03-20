public class GenerarMatriz66Recursiva18 {
 //Escribir un método que genere una matriz de tamaño n de la forma:
    public static void main(String[] args) {
        int n = 6;
        int[][] matriz = new int[n][n];
        llenarMatriz(matriz, 0, 0, n);
        imprimirMatriz(matriz);

        llenarMatrizRecursiva1(matriz, 0, 0, n);
        imprimirMatriz1(matriz);
    }

    public static void llenarMatriz(int[][] matriz, int fila, int columna, int n) {
        if (fila < n && columna < n) {
            matriz[fila][columna] = n - Math.min(fila, columna);

            llenarMatriz(matriz, fila, columna + 1, n);
            llenarMatriz(matriz, fila + 1, columna, n);
        }
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
    
        public static void llenarMatrizRecursiva1(int[][] matriz, int fila, int columna, int n) {
            if (fila == n || columna == n) {
                return; // Caso base: alcanzamos los límites de la matriz
            }
    
            matriz[fila][columna] = n - Math.min(fila, columna);
    
            if (columna < fila) {
                // Avanzamos a la siguiente columna
                llenarMatrizRecursiva1(matriz, fila, columna + 1, n);
            } else {
                // Avanzamos a la siguiente fila
                llenarMatrizRecursiva1(matriz, fila + 1, columna, n);
            }
        }
    
        public static void imprimirMatriz1(int[][] matriz) {
            for (int[] fila : matriz) {
                for (int elemento : fila) {
                    System.out.print(elemento + " ");
                }
                System.out.println();
            }
        }
    
}