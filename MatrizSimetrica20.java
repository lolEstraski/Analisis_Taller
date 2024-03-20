public class MatrizSimetrica20 {
//Determinar si una matriz es o no simétrica (es cuadrada y sus elementos por encima de la diagonal son iguales a los elementos de por debajo en forma de espejo).
    public static void main(String[] args) {
        int[][] matriz1 = {{1, 2, 3},
                           {2, 4, 5},
                           {3, 5, 6}};

        int[][] matriz2 = {{1, 2, 3},
                           {2, 4, 5},
                           {3, 6, 7}};

        System.out.println("¿La matriz 1 es simétrica? " + esMatrizSimetrica(matriz1));
        System.out.println("¿La matriz 2 es simétrica? " + esMatrizSimetrica(matriz2));
    }

    public static boolean esMatrizSimetrica(int[][] matriz) {
        // Verificar si la matriz es cuadrada
        if (matriz.length != matriz[0].length) {
            return false;
        }
        // Llamar a una función auxiliar para verificar la simetría
        return esSimetricaAux(matriz, 0, 0);
    }

    public static boolean esSimetricaAux(int[][] matriz, int fila, int columna) {
        // Base case: si llegamos al final de la matriz
        if (fila == matriz.length) {
            return true;
        }
        // Verificar si los elementos simétricos son iguales
        if (matriz[fila][columna] != matriz[columna][fila]) {
            return false;
        }
        // Avanzar a la siguiente columna
        if (columna == fila) {
            return esSimetricaAux(matriz, fila + 1, 0); // Avanzar a la siguiente fila
        } else {
            return esSimetricaAux(matriz, fila, columna + 1); // Avanzar a la siguiente columna
        }
    }
}
