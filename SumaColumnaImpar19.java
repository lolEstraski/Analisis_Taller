public class SumaColumnaImpar19 {
//Sumar todos los elementos de las columnas impares de una matriz. 
    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3, 4},
                          {5, 6, 7, 8},
                          {9, 10, 11, 12},
                          {13, 14, 15, 16}};

        int suma = sumarColumnasImpares(matriz, 0, 0);
        System.out.println("La suma de los elementos de las columnas impares es: " + suma);
    }

    public static int sumarColumnasImpares(int[][] matriz, int fila, int columna) {
        if (fila == matriz.length) {
            return 0;
        } else if (columna == matriz[fila].length) {
            return sumarColumnasImpares(matriz, fila + 1, 0);
        } else if (columna % 2 == 0) {
            return matriz[fila][columna] + sumarColumnasImpares(matriz, fila, columna + 1);
        } else {
            return sumarColumnasImpares(matriz, fila, columna + 1);
        }
    }
}
