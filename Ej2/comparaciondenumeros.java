import java.util.Scanner;

public class comparaciondenumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese dos números
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        
        // Comparar los números
        if (num1 > num2) {
            System.out.println("El primer número (" + num1 + ") es mayor que el segundo número (" + num2 + ").");
        } else if (num1 < num2) {
            System.out.println("El segundo número (" + num2 + ") es mayor que el primer número (" + num1 + ").");
        } else {
            System.out.println("Ambos números son iguales.");
        }
        
        scanner.close();
    }
}

    
