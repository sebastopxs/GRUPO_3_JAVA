public class Ejercicio4 {
    public static void main(String[] args) {
        int[] vector = {7, 2, 9};
        int n = vector.length;
        
        int max = vector[0];
        int min = vector[0];
        
        for (int i = 1; i < n; i++) {
            if (vector[i] > max) max = vector[i];
            if (vector[i] < min) min = vector[i];
        }
        
        System.out.println("Maximo: " + max + ", Minimo: " + min);
    }
}



