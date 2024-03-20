public class  potenciaRecursiva1 {
//Escribir un método que reciba 2 enteros n y b y devuelva true si n es potencia de b. Ej. 16 es potencia de 2, 64 es potencia de 4, 50 no es potencia de 10.
        public static void main(String[] args) {
            int n = 50;
            int b = 10;
            if (esPotencia(n, b)) {
                System.out.println(n + " es una potencia de " + b);
            } else {
                System.out.println(n + " no es una potencia de " + b);
            }
        }
    
        private static boolean esPotencia(int n, int b) {
            if (n < b) {
                return false;
            } else if (n == b) {
                return true;
            } else {
                return esPotencia(n / b, b);
            }
        }

        private static boolean potencia(int n ,int b ){
            //case base 
            if(n==1){
                return true;
            }
            //caso recursivo   n>1
            if (n%b!=0) {
                return false;
            }else{
                return potencia(n/b, b);
            }

        }
}
    