public class CadenaMasLargaMatrizRecursivo13 {
//De una matriz de cadenas cuadrada mostrar la cadena más larga.
    public static void main(String[] args) {
        String[][] matriz = {
            {"Hola", "Mundo", "Recursividad"},
            {"Java", "Programación", "Informática"},
            {"Lenguaje", "Desarrollo", "Computación_nubebaja"}
        }; 

        String cadenaMasLarga = encontrarCadenaMasLarga(matriz, 0, 0, "");
        System.out.println("La cadena más larga en la matriz es: " + cadenaMasLarga);

        String cadenaMasLarga1 = encontrarCadenaMasLarga1(matriz, 0, 0, "");
        System.out.println("La cadena más larga en la matriz es: " + cadenaMasLarga1);


        String cadenaMasLarga2 = encontrarCadenaMasLarga2(matriz, matriz.length, 0, 0, "");
        System.out.println("La cadena más larga en la matriz es: " + cadenaMasLarga2);
  }
    

    static String encontrarCadenaMasLarga(String[][] matriz, int fila, int columna, String actual) {
        if (fila >= matriz.length) {
            return actual; // Condición de salida
        }
        String palabraActual = matriz[fila][columna];
        if (palabraActual.length() > actual.length()) {
            actual = palabraActual;
        }
        if (columna < matriz.length - 1) {
            return encontrarCadenaMasLarga(matriz, fila, columna + 1, actual);
        } else {
            return encontrarCadenaMasLarga(matriz, fila + 1, 0, actual);
        }
    }
    public static String encontrarCadenaMasLarga1(String[][] matriz, int fila, int columna, String cadenaMasLarga) {
        if (fila == matriz.length) {
            return cadenaMasLarga;
        }

        if (columna == matriz.length) {
            return encontrarCadenaMasLarga1(matriz, fila + 1, 0, cadenaMasLarga);
        }

        if (matriz[fila][columna].length() > cadenaMasLarga.length()) {
            cadenaMasLarga = matriz[fila][columna];
        }

        return encontrarCadenaMasLarga1(matriz, fila, columna + 1, cadenaMasLarga);
    }

    public static String encontrarCadenaMasLarga2(String[][] matriz, int n, int filaActual, int columnaActual, String cadenaActual) {
        if (filaActual >= n) {
          return cadenaActual; // Caso base: Se recorrió toda la matriz
        }
        if (columnaActual >= n) {
          return encontrarCadenaMasLarga2(matriz, n, filaActual + 1, 0, cadenaActual);
        }
        String cadenaComparar = matriz[filaActual][columnaActual];
        if (cadenaComparar.length() > cadenaActual.length()) {
          cadenaActual = cadenaComparar;
        }
        return encontrarCadenaMasLarga2(matriz, n, filaActual, columnaActual + 1, cadenaActual);
      }
}
