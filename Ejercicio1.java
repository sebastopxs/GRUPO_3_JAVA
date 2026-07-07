import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del vector (n): ");
        int n = sc.nextInt();
        int[] vector = new int[n];
        int suma = 0;
        
        System.out.println("Ingrese los elementos del vector:");
        for (int i = 0; i < n; i++) {
            vector[i] = sc.nextInt();
            suma += vector[i];
        }
        
        System.out.println("Suma total: " + suma);
        sc.close();
    }
}
