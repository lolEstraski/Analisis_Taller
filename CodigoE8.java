public class CodigoE8 {
    
    public static void main(String[] args) {
        CodigoE8 codigoE8 = new CodigoE8();
        String codigo = "12345678"; // Código de 8 dígitos para probar
        boolean resultado = codigoE8.corresponde(codigo, 0, 0);
        System.out.println("El resultado es: " + resultado);
    }

    public boolean corresponde(String codigo, int i, int suma) {
        if (codigo.length() != 8)
            return false;

        if (i == codigo.length() - 1) {
            return (suma + convertir(codigo.charAt(i)) % 10 == 0);
        }

        int digito = convertir(codigo.charAt(i));
        if (i % 2 == 0) {
            suma += digito * 3;
        } else {
            suma += digito;
        }
        return corresponde(codigo, ++i, suma);
    }

    public int convertir(char digito) {
        return Character.getNumericValue(digito);
    }



    //otra forma 
}
