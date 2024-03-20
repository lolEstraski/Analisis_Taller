public class ContadorNumerosEncimaRecursivo {

    public static class Resultado {
        int porEncima;
        int porDebajo;

        public Resultado(int porEncima, int porDebajo) {
            this.porEncima = porEncima;
            this.porDebajo = porDebajo;
        }
    }

    public static Resultado contarPromedio(double[] arr, int n) {
        if (n <= 0) {
            return new Resultado(0, 0); // Caso base: Arreglo vacío
        }
        double promedio = calcularPromedio(arr, n);
        if (arr[n - 1] > promedio) {
            Resultado resultado = contarPromedio(arr, n - 1);
            return new Resultado(resultado.porEncima + 1, resultado.porDebajo);
        } else {
            Resultado resultado = contarPromedio(arr, n - 1);
            return new Resultado(resultado.porEncima, resultado.porDebajo + 1);
        }
    }

    private static double calcularPromedio(double[] arr, int n) {
        double suma = 0;
        for (int i = 0; i < n; i++) {
            suma += arr[i];
        }
        return suma / n;
    }

    public static void main(String[] args) {
        double[] arreglo = { 1.2, 3.4, 5.6, 7.8, 9.0 };
        Resultado resultado = contarPromedio(arreglo, arreglo.length);
        System.out.println("Números por encima del promedio: " + resultado.porEncima);
        System.out.println("Números por debajo del promedio: " + resultado.porDebajo);

        ///////////////////
        double[] arreglo1 = {1.5, 2.5, 3.5, 4.5, 5.5};
        int porEncima = contarPorEncimaDelPromedio(arreglo1, 0, 0, 0);
        int porDebajo = arreglo1.length - porEncima;
        System.out.println("Por encima del promedio: " + porEncima);
        System.out.println("Por debajo del promedio: " + porDebajo);
    }

    // otra forma mas facil
    public static int contarPorEncimaDelPromedio(double[] arreglo1, int index, double suma, int contador) {
        if (index == arreglo1.length) {
            double promedio = suma / arreglo1.length;
            return contador;
        }

        suma += arreglo1[index];

        return contarPorEncimaDelPromedio(arreglo1, index + 1, suma,
                contador + ((arreglo1[index] > suma / (index + 1)) ? 1 : 0));
    }

}
