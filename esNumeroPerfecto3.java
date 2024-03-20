public class esNumeroPerfecto3 {
//Un número N es perfecto si la suma de sus divisores (excluido el propio N) es N. Por ejemplo 28 es perfecto, pues sus divisores 
// (excluido el 28) son 1,2,4,7 y 14 su suma da 28. Escriba un método que indique si N es perfecto
    
    public static void main(String[] args) {
        int[] numeros = {6, 28, 12, 496, 8128};

        for (int numero : numeros) {
            if (esNumeroPerfecto(numero)) {
                System.out.println(numero + " es un número perfecto.");
            } else {
                System.out.println(numero + " no es un número perfecto.");
            }
        }
        int number = 6; // Número a verificar
        if (isPerfect(number)) {
            System.out.println(number + " es un número perfecto.");
        } else {
            System.out.println(number + " no es un número perfecto.");
        }
    }
    

        public static boolean esNumeroPerfecto(int N) {
            return sumaDivisores(N, N -1) == N;
        }
    
        private static int sumaDivisores(int N, int n) {
            if (n == 0) {
                return 0; // Caso base: la suma de divisores de 0 es 0
            }
    
            if (N % n == 0) {
                return n + sumaDivisores(N, n - 1); // Suma recursiva de divisores
            } else {
                return sumaDivisores(N, n- 1); // No es divisor, continúa con el siguiente
            }
        }
    

//o este  
public static boolean isPerfect(int number) {
    // Calcula la suma de los divisores del número (excluyendo el propio número)
    int sum = sumOfDivisors(number, 1);
    
    // Comprueba si la suma es igual al número
    return sum == number;
}

public static int sumOfDivisors(int number, int divisor) {
    // Caso base: cuando el divisor es igual al número, termina la recursión
    if (divisor == number) {
        return 0;
    }
    
    // Si el divisor es un divisor del número, lo sumamos
    if (number % divisor == 0) {
        return divisor + sumOfDivisors(number, divisor + 1);
    } else {
        // Si no es divisor, pasamos al siguiente número
        return sumOfDivisors(number, divisor + 1);
    }
}
    
}