import java.util.Arrays;

public class Ejercicio7 {
    public static void main(String[] args) {
        int[] vector = {5, 3, 4};
        int n = vector.length;
        
        for (int i = 1; i < n; i++) {
            int clave = vector[i];
            int j = i - 1;
            
            while (j >= 0 && vector[j] > clave) {
                vector[j + 1] = vector[j];
                j = j - 1;
            }
            vector[j + 1] = clave;
        }
        
        System.out.println("Vector ordenado: " + Arrays.toString(vector));
    }
}

