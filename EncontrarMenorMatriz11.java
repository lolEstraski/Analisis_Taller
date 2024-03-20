public class EncontrarMenorMatriz11{
//Buscar el número menor en una matriz cuadrada de números enteros dada.

    public static int encontrarMenor(int[][] matriz, int n, int filaActual, int columnaActual, int menorActual) {
      if (filaActual >= n) {
        return menorActual; // Caso base: Se recorrió toda la matriz
      }
      if (columnaActual >= n) {
        return encontrarMenor(matriz, n, filaActual + 1, 0, menorActual);
      }
      if (matriz[filaActual][columnaActual] < menorActual) {
        menorActual = matriz[filaActual][columnaActual];
      }
      return encontrarMenor(matriz, n, filaActual, columnaActual + 1, menorActual);
    }

    public static int encontrarMenor(int[][] matriz, int fila, int columna, int menor) {
        if (fila == matriz.length) {
            return menor;
        }

        if (columna == matriz.length) {
            return encontrarMenor(matriz, fila + 1, 0, menor);
        }

        if (matriz[fila][columna] < menor) {
            menor = matriz[fila][columna];
        }

        return encontrarMenor(matriz, fila, columna + 1, menor);
    }

  
    public static void main(String[] args) {
      int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
      int menor = encontrarMenor(matriz, matriz.length, 0, 0, Integer.MAX_VALUE);
      System.out.println("El número menor en la matriz es: " + menor);

      int menor1 = encontrarMenor(matriz, 0, 0, matriz[0][0]);
      System.out.println("El número menor en la matriz es: " + menor1);
    }
  }
  