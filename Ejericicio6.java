public class Ejercicio6 {
    public static void main(String[] args) {
        char[] cadena = {'x', 'a', 'c'};
        int n = cadena.length;
        char temp;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (cadena[j] > cadena[j + 1]) {
                    temp = cadena[j];
                    cadena[j] = cadena[j + 1];
                    cadena[j + 1] = temp;
                }
            }
        }
        
        System.out.println("Cadena ordenada: " + new String(cadena));
    }
}

