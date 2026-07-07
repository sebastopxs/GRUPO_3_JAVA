public class Ejercicio5 {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println("Factorial de " + n + " es: " + factorial(n));
    }
}




