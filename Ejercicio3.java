import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de la matriz (n): ");
        int n = sc.nextInt();
        int[][] matriz = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
