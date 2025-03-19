import java.util.Scanner;

public class Numeroparoimpar {
  
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese un número
        System.out.print("Ingrese un número: ");
        int num = scanner.nextInt();
        
        // Verificar si el número es par o impar
        if (num % 2 == 0) {
            System.out.println("El número " + num + " es par.");
        } else {
            System.out.println("El número " + num + " es impar.");
        }
        
        scanner.close();
    }
}
