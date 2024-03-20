public class CadenaPares7 {
//Retornar en una cadena los números ubicados en las posiciones pares de un arreglo de int.

    public static String obtenerNumerosPares(int[] arr, int n) {
      if (n <= 0) {
        return ""; // Caso base: Arreglo vacío
      } else if (n % 2 == 0) {
        return arr[n - 1] + " " + obtenerNumerosPares(arr, n - 2);
      } else {
        return obtenerNumerosPares(arr, n - 1);
      }
    }

    public static String obtenerNumerosPosicionesPares(int[] arreglo, int indice) {
        // Caso base: si el índice está fuera del rango del arreglo, retornamos una cadena vacía
        if (indice >= arreglo.length) {
            return "";
        }
        
        // Si el índice es par, agregamos el número en esa posición a la cadena
        if (indice % 2 == 0) {
            return arreglo[indice] + " " + obtenerNumerosPosicionesPares(arreglo, indice + 1);
        } else {
            // Si el índice es impar, solo pasamos al siguiente índice
            return obtenerNumerosPosicionesPares(arreglo, indice + 1);
        }
    }
  
    public static void main(String[] args) {
      int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
      String numerosPares = obtenerNumerosPares(arreglo, arreglo.length);
      System.out.println("Los números en posiciones pares son: " + numerosPares);

       // Llamada al método para obtener los números en posiciones pares
       String numerosPares1 = obtenerNumerosPosicionesPares(arreglo, 0);
       System.out.println("Números en posiciones pares: " + numerosPares1);
    }

    //Tu implementación: if (n % 2 == 0) verifica si n es par.
    //Mi implementación: if (indice % 2 == 0) verifica si indice es par
  }
  