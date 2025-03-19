package Ej20;
import java.util.Scanner;

public class CalculoDeExpresionCombinada {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

   // Solicitar al usuario tres numeros

System.out.println("Ingrese el valor de a ");
double a = scanner.nextDouble();

System.out.println("Ingrese el valor de b");
double b = scanner.nextDouble();

System.out.println("Ingrese el valor de c");
double c = scanner.nextDouble();

// Verificar que la resta (a - b) no sea cero
if (a -b == 0) {
    System.out.println("ERROR: La operacion (a - b) no puede ser 0 para evitar dividirse por cero");
    
}else{
    // Calcular la expresion (a + b) * c/ (a - b)
    double resultado = (a + b) * c/ (a - b);
    System.out.println("El resultado de la expresion: "+ resultado);

     }
     scanner.close();
}
}