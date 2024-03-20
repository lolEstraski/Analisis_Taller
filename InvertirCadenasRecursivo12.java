public class InvertirCadenasRecursivo12{

    //Invertir todas las cadenas de caracteres de un array.

    public static void main(String[] args) {
        String[] arreglo = {"Hola", "Mundo", "Recursividad", "Java"};
        invertirCadenas(arreglo, 0);
        System.out.println("Arreglo invertido: ");
        for (String palabra : arreglo) {
            System.out.println(palabra);
        }
  }
    

    static void invertirCadenas(String[] arr, int indice) {
        if (indice >= arr.length) {
            return; // Condición de salida
        }
        String actual = arr[indice];
        String invertida = invertir(actual);
        arr[indice] = invertida;
        invertirCadenas(arr, indice + 1);
    }

    static String invertir(String palabra) {
        if (palabra.length() <= 1) {
            return palabra; // Condición de salida
        }
        char primerCaracter = palabra.charAt(0);
        String restoInvertido = invertir(palabra.substring(1));
        return restoInvertido + primerCaracter;
    }
    
}
