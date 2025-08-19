package Calculadora;
// This Java program implements a simple calculator that performs addition, subtraction, multiplication, and division on two numbers based on user input.
import java.util.Scanner;

public class prueba {
    public static void main(String[] args){ 

        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadorea simple de 2 numeros.");
        System.out.println("Elige el tipo de operacion que quieres realizar:\n 1. Suma\n 2. Resta\n 3. Multiplicacion\n 4. Division");
        
        int opcion = scanner.nextInt();

        System.out.print("Enter a number: ");
        int a = scanner.nextInt();
        
        System.out.print("second number: ");
        int b = scanner.nextInt();
        scanner.close();

        if(opcion == 1){
            System.out.println("Suma: " + (a + b));
        }
        else if(opcion == 2){
            System.out.println("Resta: " + (a - b));
        }
        else if(opcion == 3){
            System.out.println("Multiplicacion: " + (a * b));
        }
        else if(opcion == 4){
            if(b != 0) {
                System.out.println("Division: " + ((double)a / b));
            } else {
                System.out.println("Error: No se puede dividir entre cero.");
            }
        }
        else {
            System.out.println("Opcion no valida.");
        }


        
    }
}