public class numprimo {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (esPrimo(i)) {
                System.out.println(i + " - es primo");
            } else {
                System.out.println(i + " - no es primo");
            }
        }
    }

    // Método para saber si un número es primo
    public static boolean esPrimo(int num) {
        if (num <= 1) return false;
        for (int j = 2; j <= Math.sqrt(num); j++) {
            if (num % j == 0) return false;
        }
        return true;
    }
}
