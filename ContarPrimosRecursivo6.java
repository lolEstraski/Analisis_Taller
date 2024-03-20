public class ContarPrimosRecursivo6 {

    //Contar cuántos números primos hay en un arreglo de enteros y retornar dicha cuenta.
    public static void main(String[] args) {
        int[] arreglo = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 }; // Ejemplo de arreglo

        // Llamada al método para contar los números primos en el arreglo
        int contadorPrimos = contarPrimosRecursivo(arreglo, 0);

        System.out.println("Cantidad de números primos en el arreglo: " + contadorPrimos);
    }

    public static int contarPrimosRecursivo(int[] arreglo, int indice) {
        if (indice >= arreglo.length) {
            return 0;
        }

        // Si el elemento en el índice actual es primo, sumamos 1 y continuamos con el
        // siguiente índice
        if (esPrimo(arreglo[indice])) {
            return 1 + contarPrimosRecursivo(arreglo, indice + 1);
        } else {
            // Si no es primo, solo continuamos con el siguiente índice
            return contarPrimosRecursivo(arreglo, indice + 1);
        }
    }

    static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
