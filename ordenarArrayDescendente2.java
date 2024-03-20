public class ordenarArrayDescendente2 {
//Ordenar un array de forma descendente.

    public static void ordenarDescendente(int[] arr, int n) {
        // Caso base: si n es 1, el array ya está ordenado
        if (n == 1) {
            return;
        }

        // Recursión
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                // Intercambiar arr[i] y arr[i+1]
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        // Llamada recursiva para ordenar los primeros n-1 elementos
        ordenarDescendente(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9, 3};
        System.out.println("Array original: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        ordenarDescendente(arr, arr.length);

        System.out.println("\nArray ordenado de forma descendente: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}