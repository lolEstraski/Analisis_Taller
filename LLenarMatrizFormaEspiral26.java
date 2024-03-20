public class LLenarMatrizFormaEspiral26 {
//Llenar la matriz de acuerdo con la estructura presentada. Debe funcionar para diferentes tamaños de entrada.

    public static void main(String[] args) {
        int filas = 5;
        int columnas = 5;
        int[][] matriz = new int[filas][columnas];
    
        llenarEnEspiral(matriz, 0, 0, filas - 1, columnas - 1, 1);
        imprimirMatriz(matriz);
    }
    
    public static void llenarEnEspiral(int[][] matriz, int filaInicio, int columnaInicio, int filaFin, int columnaFin, int valor) {
        if (filaInicio > filaFin || columnaInicio > columnaFin) {
            return;
        }
    
        // Llenar la fila superior
        for (int i = columnaInicio; i <= columnaFin; i++) {
            matriz[filaInicio][i] = valor++;
        }
    
        // Llenar la columna derecha
        for (int i = filaInicio + 1; i <= filaFin; i++) {
            matriz[i][columnaFin] = valor++;
        }
    
        // Llenar la fila inferior si hay más de una fila
        if (filaInicio < filaFin) {
            for (int i = columnaFin - 1; i >= columnaInicio; i--) {
                matriz[filaFin][i] = valor++;
            }
        }
    
        // Llenar la columna izquierda si hay más de una columna
        if (columnaInicio < columnaFin) {
            for (int i = filaFin - 1; i > filaInicio; i--) {
                matriz[i][columnaInicio] = valor++;
            }
        }
    
        // Llenar la submatriz interna recursivamente
        llenarEnEspiral(matriz, filaInicio + 1, columnaInicio + 1, filaFin - 1, columnaFin - 1, valor);
    }
    
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
    




}
