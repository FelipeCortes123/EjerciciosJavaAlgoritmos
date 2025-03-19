package Ej16;
import java.util.Scanner;

public class ComprobacionDeMultiplos {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// solicitar al usuario dos numeros 
     
System.out.println("Ingresar un numero");
int num1 = scanner.nextInt();

 System.out.println("Ingresar un numero");
 int num2 = scanner.nextInt();
  
 // verificar si son multiplos
 if (num1 % num2 == 0) {
    System.out.println(num1 +  " Es multiplo de "  + num2);

 }else{
    System.out.println(num1 +  "  No es multiplo"  +num2 );
 }
  scanner.close();
    
}
}
