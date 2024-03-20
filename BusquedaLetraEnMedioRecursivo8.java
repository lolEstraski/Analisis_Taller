public class BusquedaLetraEnMedioRecursivo8 {
    
    //Buscar en un arreglo de cadenas cuales de ellas tiene como letra del medio la “e”.
    public static void main(String[] args) {
        String[] arreglo = {"ceer", "elefante", "perro", "mesa", "televisor"};
        
        System.out.println("Palabras con 'e' en el medio:");
        buscarLetraMedioE(arreglo, 0, arreglo.length - 1);
    }
    
    public static void buscarLetraMedioE(String[] arreglo, int inicio, int fin) {
        if (inicio <= fin) {
            int mitad = (inicio + fin) / 2;
            if (tieneEEnMedio(arreglo[mitad])) {
                System.out.println(arreglo[mitad]);
            }
            buscarLetraMedioE(arreglo, inicio, mitad - 1);
            buscarLetraMedioE(arreglo, mitad + 1, fin);
        }
    }
    
    public static boolean tieneEEnMedio(String palabra) {
        int longitud = palabra.length();
        if (longitud % 2 == 0) {
            return palabra.charAt(longitud / 2 - 1) == 'e';
        } else {
            return palabra.charAt(longitud / 2) == 'e';
        }
    }
}
