public class LlenarMatrizSerpiente21 {
//llenar una matriz en forma de serpiente
    public static void main(String[] args) {
        int n = 4; // Tamaño de la matriz
        int[][] matriz = new int[n][n];

        llenarMatrizSerpiente(matriz, 1, 0, 0, n, 1);

        // Imprimir la matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void llenarMatrizSerpiente(int[][] matriz, int valor, int fila, int columna, int n, int direccion) {
        // Caso base: si hemos llenado todos los elementos de la matriz
        if (valor > n * n) {
            return;
        }

        // Llenar la fila de izquierda a derecha
        if (direccion == 1) {
            if (columna < n) {
                matriz[fila][columna] = valor;
                llenarMatrizSerpiente(matriz, valor + 1, fila, columna + 1, n, 1);
            } else {
                llenarMatrizSerpiente(matriz, valor, fila + 1, columna - 1, n, 2);
            }
        }
        // Llenar la fila de derecha a izquierda
        else if (direccion == 2) {
            if (columna >= 0) {
                matriz[fila][columna] = valor;
                llenarMatrizSerpiente(matriz, valor + 1, fila, columna - 1, n, 2);
            } else {
                llenarMatrizSerpiente(matriz, valor, fila + 1, columna + 1, n, 1);
            }
        }
    }
}
