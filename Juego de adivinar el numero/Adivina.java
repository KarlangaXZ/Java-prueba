
public class Adivina {
    public static void main(String[] args) {
        // Generar un número aleatorio entre 1 y 100
        int numeroSecreto = (int) (Math.random() * 100) + 1;
        int intentos = 0;
        boolean adivinado = false;

        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("He elegido un número entre 1 y 100. ¡Intenta adivinarlo!");

        while (!adivinado) {
            // Leer la entrada del usuario
            System.out.print("Introduce tu suposición: ");
            int suposicion = new java.util.Scanner(System.in).nextInt();
            intentos++;

            if (suposicion < numeroSecreto) {
                System.out.println("Demasiado bajo. Inténtalo de nuevo.");
            } else if (suposicion > numeroSecreto) {
                System.out.println("Demasiado alto. Inténtalo de nuevo.");
            } else {
                adivinado = true;
                System.out.println("¡Felicidades! Has adivinado el número " + numeroSecreto + " en " + intentos + " intentos.");
            }
        }
    }
    
}
