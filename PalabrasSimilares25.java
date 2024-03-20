import java.util.ArrayList;
import java.util.List;

public class PalabrasSimilares25 {

   /*  Dada una matriz de Strings (de n filas x 2 columnas), donde cada fila corresponde a un caso 
    de prueba (con dos palabras p1 y p2), devolver un vector que contenga las posiciones de las filas de la matriz 
    original que cumplen el criterio de ser palabras similares. Dos palabras son similares si tienen la misma longitud y la 
    información de p1 está en p2 en cualquier orden. Por ejemplo:*/
    public static void main(String[] args) {
        String[][] matriz = {
                { "cama", "acma" },
                { "oso", "roso" },
                { "tele", "late" },
                { "gato", "toga" }
        };

        ArrayList<Integer> posiciones = encontrarPalabrasSimilares(matriz);

        System.out.println("Posiciones de palabras similares:");
        System.out.println(posiciones);

        List<Integer> similarWordRows = findSimilarWords(matriz);
        System.out.println("Filas con palabras similares: " + similarWordRows);
    }

    public static ArrayList<Integer> encontrarPalabrasSimilares(String[][] matriz) {
        ArrayList<Integer> posiciones = new ArrayList<>();
        encontrarPalabrasSimilaresRecursivo(matriz, 0, posiciones);
        return posiciones;
    }

    public static void encontrarPalabrasSimilaresRecursivo(String[][] matriz, int fila, ArrayList<Integer> posiciones) {
        if (fila == matriz.length) {
            return; // Caso base: hemos recorrido todas las filas de la matriz
        }

        String palabra1 = matriz[fila][0];
        String palabra2 = matriz[fila][1];

        if (sonSimilares(palabra1, palabra2)) {
            posiciones.add(fila); // Agregar la posición de la fila a la lista
        }

        // Llamar recursivamente para la siguiente fila
        encontrarPalabrasSimilaresRecursivo(matriz, fila + 1, posiciones);
    }

    ///otro caso

    public static boolean sonSimilares(String palabra1, String palabra2) {
        if (palabra1.length() != palabra2.length()) {
            return false; // Las palabras deben tener la misma longitud para ser similares
        }

        for (int i = 0; i < palabra1.length(); i++) {
            char letra = palabra1.charAt(i);
            if (palabra2.indexOf(letra) == -1) {
                return false; // Si una letra de palabra1 no está en palabra2, no son similares
            }
        }

        return true;
    }
    public static List<Integer> findSimilarWords(String[][] matrix) {
        List<Integer> result = new ArrayList<>();
        checkSimilarity(matrix, 0, result);
        return result;
    }

    private static void checkSimilarity(String[][] matrix, int row, List<Integer> result) {
        if (row == matrix.length) {
            return; // Caso base: se han revisado todas las filas
        }

        String p1 = matrix[row][0];
        String p2 = matrix[row][1];

        if (p1.length() == p2.length() && containsAllChars(p1, p2)) {
            result.add(row); // Se cumple el criterio de similitud, se agrega el índice de la fila
        }

        checkSimilarity(matrix, row + 1, result); // Se llama recursivamente para la siguiente fila
    }

    private static boolean containsAllChars(String str1, String str2) {
        for (char c : str1.toCharArray()) {
            if (!str2.contains(String.valueOf(c))) {
                return false; // La palabra str2 no contiene el carácter c
            }
        }
        return true; // str2 contiene todos los caracteres de str1
    }

}
