import java.util.ArrayList;

public class EsMultiploTamano22 {
//Escriba un método que recorra un ArrayList de tipo Integer, y verifique si la suma de todos sus elementos es un múltiplo de su tamaño.

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(2);
        lista.add(4);
        lista.add(6);
        lista.add(8);

        System.out.println("La suma de los elementos es un múltiplo de su tamaño? " + esMultiploDeTamaño(lista, 0, 0));
    }

    public static boolean esMultiploDeTamaño(ArrayList<Integer> lista, int indice, int suma) {
        // Caso base: cuando hemos recorrido toda la lista
        if (indice == lista.size()) {
            // Verificar si la suma es un múltiplo de tamaño
            return suma % lista.size() == 0;
        }

        // Agregar el elemento actual a la suma
        suma += lista.get(indice);

        // Llamar recursivamente con el siguiente índice
        return esMultiploDeTamaño(lista, indice + 1, suma);
    }
}
