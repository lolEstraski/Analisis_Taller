public class codigoBarrasE11 {


	public static void main(String[] args) {
		  String codigo = "63456583712";
		    boolean esE11 = esCodigoE11("","",codigo,0,0,false,0);
		    System.out.println("El código " + codigo + " es un código E-11 válido: " + esE11);
		}
	
	public static Boolean esCodigoE11(String S1,String S2  ,String codigo, int sumaS1, int sumaS2, boolean sumaCompletada, int i){
        int auxiliar=0;
        if(codigo. length() !=11){
            return false;
        }

        if (S1. equals("") && S2. equals ("")){
            S1=codigo.substring(1,6); //
            S2=codigo. substring(6,11);//
        }

        if ( (sumaS1> sumaS2) && sumaCompletada){
            System.out.println("");
            System. out.println("suma prima:"+ (sumaS2 + ( (int)codigo. charAt (0))-48) );
            return esPrimo( sumaS2 + ( (int)codigo. charAt (0))-48, 2);
        }

        if(sumaCompletada) {
            return false;
        }

        if(i>=0 && i<=4){
            auxiliar=((int)S1. charAt (i))-48;
            if (auxiliar % 2 ==0) {
                sumaS1+=auxiliar * 5;
                System.out.println("s1: "+sumaS1);
            }else {
                sumaS1+=auxiliar * 3;
                System.out.println("S1: "+sumaS1);
            }
        }else{
            auxiliar=( (int)S2. charAt ((i-5)))-48 ;
            if(auxiliar %2 ==0) {
                sumaS2+=auxiliar *5;
                System.out.println("S2: "+sumaS2);
            }else {
                sumaS2+=auxiliar *3;
                System.out.println("S2: "+sumaS2);
            }
        }
        i++;

        if(i!=codigo. length() -1) {
            return esCodigoE11 ( S1,S2  , codigo, sumaS1,  sumaS2, false,  i);
        }else {
            return esCodigoE11 ( S1,S2  , codigo, sumaS1,  sumaS2, true,  i);
        }

    }

    private static boolean esPrimo(int n, int i) { //verifica si es primo
        if (n <= 2) return (n == 2);
        if (n % i == 0) return false;
        if (i * i > n) return true;
        return esPrimo(n, i + 1);
    }
}