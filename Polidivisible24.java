import java.util.ArrayList;

public class Polidivisible24 {

    /*
     * Dada una matriz de números enteros, devolver un arreglo con todos los
     * elementos que corresponden a números polidivisibles. Los números
     * polidivisibles son aquellos números que:
     * Son mayores que cero.
     * El número formado por su primer dígito es múltiplo de 1 (esto lo cumplen
     * todos los números).
     * El número formado por sus dos primeros dígitos es múltiplo de 2.
     * El número formado por sus tres primeros dígitos es múltiplo de 3.
     * El número formado por sus cuatro primeros dígitos es múltiplo de 4.
     **/

    public static void main(String[] args) {
        int[][] matriz = { { 2016, 4233, 123456, 2468 },
                { 1234, 5678, 9012, 3456 },
                { 1122, 3344, 5566, 7788 } };

        ArrayList<Integer> polidivisibles = new ArrayList<>();
        encontrarPolidivisibles(matriz, polidivisibles);

        System.out.println("Números polidivisibles en la matriz:");
        System.out.println(polidivisibles);
    }

    public static void encontrarPolidivisibles(int[][] matriz, ArrayList<Integer> resultado) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int numero = matriz[i][j];
                if (esPolidivisible(numero)) {
                    resultado.add(numero);
                }
            }
        }
    }

    public static boolean esPolidivisible(int numero) {
        String numeroStr = String.valueOf(numero);
        return esPolidivisibleAux(numeroStr, 1);
    }

    public static boolean esPolidivisibleAux(String numeroStr, int posicion) {
        if (posicion > numeroStr.length()) {
            return true;
        }

        int numParcial = Integer.parseInt(numeroStr.substring(0, posicion));
        if (numParcial % posicion == 0) {
            return esPolidivisibleAux(numeroStr, posicion + 1);
        } else {
            return false;
        }
    }
}
