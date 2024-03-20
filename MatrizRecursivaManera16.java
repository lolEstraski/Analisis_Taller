
public class MatrizRecursivaManera16 {
   // Generar una matriz de la siguiente manera: 0000001
   //                                            0000012
   //                                            0000123
   //                                            0001234

        public static void main(String[] args) {
            int filas = 6;
            int columnas = 6;
            int[][] matriz = new int[filas][columnas];
            generarMatriz(matriz, 0);
            imprimirMatriz(matriz);
        }
    
        public static void generarMatriz(int[][] matriz, int fila) {
            if (fila == matriz.length) {
                return;
            }
    
            for (int columna = fila; columna < matriz[0].length; columna++) {
                matriz[fila][columna] = columna - fila;
            }
    
            generarMatriz(matriz, fila + 1);
        }
    
        public static void imprimirMatriz(int[][] matriz) {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[0].length; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
    


