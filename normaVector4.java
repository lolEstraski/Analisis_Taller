public class normaVector4 {
//Escriba un método que retorne la norma de un vector (a) de tamaño n. La norma de un vector se calcula sacando la raíz cuadrada
 //a la sumatoria de cada uno de sus elementos al cuadrado.
    public static void main(String[] args) {

        double[] vector2 = {4.0, 5.0, 6.0, 7.0};
        System.out.println("Norma del vector [4.0, 5.0, 6.0, 7.0]: " + normaVector(vector2, vector2.length));
        

        double[] vector = {4.0, 5.0, 6.0,7.0}; // Ejemplo de vector
        
        // Llamada al método para calcular la norma
        double norma = calcularNormaRecursiva(vector, 0);

        System.out.println("La norma del vector es: " + norma);
    }
    


    public static double normaVector(double[] vector, int n) {
        if (n == 0) {
            return 0; // Caso base: la norma de un vector vacío es 0
        } else {
            double ultimoElemento = vector[n - 1];
            double sumaRestantesCuadrados = normaVector(vector, n - 1);
            return Math.pow(ultimoElemento, 2) + sumaRestantesCuadrados;
        }

    }

    public static double calcularNormaRecursiva(double[] vector, int indice) {
        // Caso base: cuando el índice alcanza el final del vector
        if (indice == vector.length) {
            return 0.0;
        }
        
        // Calcula el cuadrado del elemento actual y lo suma al cuadrado acumulado
        double cuadradoElemento = vector[indice] * vector[indice];
        double cuadradoRestante = calcularNormaRecursiva(vector, indice + 1);
        double sumaCuadrados = cuadradoElemento + cuadradoRestante;
        
        // Devuelve la suma de cuadrados
        return sumaCuadrados;
    }
}