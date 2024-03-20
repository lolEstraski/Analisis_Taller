public class sumarArreglo5 {

  //Sumar todos los valores de un arreglo de int y retornar dicho valor.

    public static int sumarArreglo(int[] arr, int n) {
      if (n <= 0) {
        return 0;
      } else {
        return arr[n - 1] + sumarArreglo(arr, n - 1);
      }
    }

    public static int sumarArregloRecursiva(int[] arreglo, int indice) {
        // Caso base: cuando el índice es menor que 0, retornamos 0
        if (indice < 0) {
            return 0;
        }
        
        // Llamada recursiva para sumar los elementos anteriores al índice actual
        int sumaParcial = sumarArregloRecursiva(arreglo, indice - 1);
        
        // Sumamos el valor en el índice actual al resultado parcial
        return sumaParcial + arreglo[indice];
    }
  
    public static void main(String[] args) {
      int[] arreglo = {1, 2, 3, 4, 5};
      int suma = sumarArreglo(arreglo, arreglo.length);
      System.out.println("La suma de los elementos del arreglo es: " + suma);

      int suma1 = sumarArregloRecursiva(arreglo, arreglo.length - 1);
        
      System.out.println("La suma de los valores del arreglo es: " + suma1);
    }
}

  
  