import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de notas (n): ");
        int n = sc.nextInt();
        double[] notas = new double[n];
        double suma = 0.0;
        
        System.out.println("Ingrese las notas:");
        for (int i = 0; i < n; i++) {
            notas[i] = sc.nextDouble();
            suma += notas[i];
        }
        
        double prom = suma / n;
        System.out.println("Promedio: " + prom);
        sc.close();
    }
}

